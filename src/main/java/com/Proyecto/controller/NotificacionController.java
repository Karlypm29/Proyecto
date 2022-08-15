package com.Proyecto.controller;

import com.Proyecto.domain.Notificacion;
import com.Proyecto.service.NotificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NotificacionController {
   
    @Autowired
    private NotificacionService notificacionService;
    
    @GetMapping("/notificacion/listado")
    public String Inicio(Model model){
        var notificacions = notificacionService.getNotificacions();
        model.addAttribute("totalNotificacions",notificacions.size());
        model.addAttribute("notificacions", notificacions);
        return "/notificacion/listado";
    }
    
    @GetMapping("/notificacion/nuevo")
    public String nuevoNotificacion(Notificacion notificacion){
        return "/notificacion/modificar";
    }
    
    @PostMapping("/notificacion/guardar")
    public String guardarNotificacion(Notificacion notificacion){
        notificacionService.save(notificacion);
        return "redirect:/notificacion/listado";
    }
    
    @GetMapping("/notificacion/modificar/{idNotificacion}")
    public String modificarNotificacion(Notificacion notificacion, Model model){
        notificacion = notificacionService.getNotificacion(notificacion);
        model.addAttribute("notificacion", notificacion);
        return "/notificacion/modificar";
    }
    
    @GetMapping("/notificacion/eliminar/{idNotificacion}")
    public String eliminarNotificacion(Notificacion notificacion){
        notificacionService.delete(notificacion);
        return "redirect:/notificacion/listado";
    }
}
