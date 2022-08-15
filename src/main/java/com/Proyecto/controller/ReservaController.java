package com.Proyecto.controller;

import com.Proyecto.domain.Reserva;
import com.Proyecto.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ReservaController {
   
    @Autowired
    private ReservaService reservaService;
    
    @GetMapping("/reserva/listado")
    public String Inicio(Model model){
        var reservas = reservaService.getReservas();
        model.addAttribute("totalReservas",reservas.size());
        model.addAttribute("reservas", reservas);
        return "/reserva/listado";
    }
    
    @GetMapping("/reserva/nuevo")
    public String nuevoReserva(Reserva reserva){
        return "/reserva/modificar";
    }
    
    @PostMapping("/reserva/guardar")
    public String guardarReserva(Reserva reserva){
        reservaService.save(reserva);
        return "redirect:/reserva/listado";
    }
    
    @GetMapping("/reserva/modificar/{idReserva}")
    public String modificarReserva(Reserva reserva, Model model){
        reserva = reservaService.getReserva(reserva);
        model.addAttribute("reserva", reserva);
        return "/reserva/modificar";
    }
    
    @GetMapping("/reserva/eliminar/{idReserva}")
    public String eliminarReserva(Reserva reserva){
        reservaService.delete(reserva);
        return "redirect:/reserva/listado";
    }
}
