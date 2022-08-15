package com.Proyecto.controller;

import com.Proyecto.domain.Emergencia;
import com.Proyecto.service.EmergenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmergenciaController {
   
    @Autowired
    private EmergenciaService emergenciaService;
    
    @GetMapping("/emergencia/listado")
    public String Inicio(Model model){
        var emergencias = emergenciaService.getEmergencias();
        model.addAttribute("totalEmergencias",emergencias.size());
        model.addAttribute("emergencias", emergencias);
        return "/emergencia/listado";
    }
    
    @GetMapping("/emergencia/nuevo")
    public String nuevoEmergencia(Emergencia emergencia){
        return "/emergencia/modificar";
    }
    
    @PostMapping("/emergencia/guardar")
    public String guardarEmergencia(Emergencia emergencia){
        emergenciaService.save(emergencia);
        return "redirect:/emergencia/listado";
    }
    
    @GetMapping("/emergencia/modificar/{idEmergencia}")
    public String modificarEmergencia(Emergencia emergencia, Model model){
        emergencia = emergenciaService.getEmergencia(emergencia);
        model.addAttribute("emergencia", emergencia);
        return "/emergencia/modificar";
    }
    
    @GetMapping("/emergencia/eliminar/{idEmergencia}")
    public String eliminarEmergencia(Emergencia emergencia){
        emergenciaService.delete(emergencia);
        return "redirect:/emergencia/listado";
    }
}
