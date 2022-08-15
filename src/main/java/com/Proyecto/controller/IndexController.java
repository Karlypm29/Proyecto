package com.Proyecto.controller;

import com.Proyecto.dao.UsuarioDao;
import com.Proyecto.domain.Carrito;
import com.Proyecto.domain.CarritoDetalle;
import com.Proyecto.domain.Cliente;
import com.Proyecto.domain.Usuario;
import com.Proyecto.service.ArticuloService;
import com.Proyecto.service.CarritoDetalleService;
import com.Proyecto.service.CarritoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.Proyecto.service.ClienteService;
import java.util.Arrays;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Karly
 */
@Controller
@Slf4j
public class IndexController {

    @Autowired
    private ArticuloService articuloService;
    @Autowired
    private CarritoService carritoService;
    @Autowired
    private CarritoDetalleService carritoDetalleService;
    @Autowired
    private UsuarioDao usuarioDao;

    @GetMapping("/")
    public String inicio(Model model, HttpServletRequest request) {
        //Obtener el usuario llegado
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        UserDetails user = null;
        
        if (principal instanceof UserDetails) {
            user = (UserDetails) principal;
        }
        //Validar si es usuario de un cliente
        boolean esCliente = false;
        
        if (user.getAuthorities().size() == 1) {
            for (var rol : user.getAuthorities()) {
                if (rol.getAuthority().equals("ROLE_USER")) {
                    esCliente = true;
                }
            }
        }
        if (esCliente) {
            Usuario usuario = usuarioDao.findByUsername(user.getUsername());
            Carrito carrito = carritoService.getCarritoCliente(usuario.getIdCliente());
            request.getSession().setAttribute("idCliente", usuario.getIdCliente());
            request.getSession().setAttribute("idCarrito", carrito.getIdCarrito());
            //Consultar los items
            List<CarritoDetalle> carritoDetalles = carritoDetalleService.getCarritoDetalles(carrito.getIdCarrito());
            int cantidadArticulosCarrito = carritoDetalles.size();
            model.addAttribute("cantidadArticulosCarrito", cantidadArticulosCarrito);
        }
        log.info("Ahora se usa arquitectura MVC");
        var articulos = articuloService.getArticulos();
        model.addAttribute("articulos", articulos);
        model.addAttribute("esCliente", esCliente);
        return "index";
    }
}