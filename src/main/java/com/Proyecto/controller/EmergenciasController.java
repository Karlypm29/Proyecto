/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.controller;

import com.Proyecto.domain.Emergencias;
import com.Proyecto.service.EmergenciasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class EmergenciasController {
        @Autowired
    private EmergenciasService emergenciaService;
    
    
    
    @GetMapping("/EmergenciasGuardar")
    public String EmergenciasGuardar(Model model) {
        
        return "Emergencias";
    }
    
    @PostMapping("/Emergencias2")
    public String EmergenciasRedirecionar(Model model) {
        
        return "Emergencias";
    }
    
    @GetMapping("/AdministradorEmergencias")
    public String Inicio(Model model){
        var Emergencias = emergenciaService.getEmergencias();
        model.addAttribute("Emergencias", Emergencias);
        return "AdministradorEmergencias";
    }
    
     @GetMapping("/modificarEmergencias/{idEmergencias}")
    public String modificarEmergencia(Emergencias emergencia, Model model){
        emergencia = emergenciaService.getEmergencias(emergencia);
        model.addAttribute("Emergencias", emergencia);
        return "modificaEmergencias";
    }
    
    @GetMapping("/eliminarEmergencias/{idEmergencias}")
    public String eliminarEmergencias(Emergencias emergencias){
        emergenciaService.delete(emergencias);
        return "redirect:/AdministradorEmergencias";
    }
    
   @GetMapping("/nuevoEmergencias")
    public String nuevoEmergencias(Emergencias emergencias) {
        return "modificaEmergencias";
    }

    @PostMapping("/guardarEmergencias")
    public String guardarEmergencias(Emergencias emergencias) {
        emergenciaService.save(emergencias);
        return "redirect:/reservaGuardar";
    }
    
}
