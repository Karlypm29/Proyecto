package com.Proyecto.controller;

import com.Proyecto.domain.Soporte;
import com.Proyecto.service.SoporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SoporteController {
   
    @Autowired
    private SoporteService soporteService;
    
    @GetMapping("/soporte/listado")
    public String Inicio(Model model){
        var soportes = soporteService.getSoportes();
        model.addAttribute("totalSoportes",soportes.size());
        model.addAttribute("soportes", soportes);
        return "/soporte/listado";
    }
    
    @GetMapping("/soporte/nuevo")
    public String nuevoSoporte(Soporte soporte){
        return "/soporte/modificar";
    }
    
    @PostMapping("/soporte/guardar")
    public String guardarSoporte(Soporte soporte){
        soporteService.save(soporte);
        return "redirect:/soporte/listado";
    }
    
    @GetMapping("/soporte/modificar/{idSoporte}")
    public String modificarSoporte(Soporte soporte, Model model){
        soporte = soporteService.getSoporte(soporte);
        model.addAttribute("soporte", soporte);
        return "/soporte/modificar";
    }
    
    @GetMapping("/soporte/eliminar/{idSoporte}")
    public String eliminarSoporte(Soporte soporte){
        soporteService.delete(soporte);
        return "redirect:/soporte/listado";
    }
}
