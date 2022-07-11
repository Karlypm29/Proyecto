/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.controller;

import com.Proyecto.domain.Reserva;
import com.Proyecto.service.ReservaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class ReservaController {
    
    @Autowired
    private ReservaService reservaService;
    
    
    
    @GetMapping("/reservaGuardar")
    public String ReservaGuardar(Model model) {
        
        return "Reservacion";
    }
    
    @PostMapping("/reserva2")
    public String ReservaRedirecionar(Model model) {
        
        return "Reservacion";
    }
    
    @GetMapping("/AdministradorReserva")
    public String Inicio(Model model){
        var reservas = reservaService.getReservas();
        model.addAttribute("reservas", reservas);
        return "AdministradorReserva";
    }
    
     @GetMapping("/modificarReserva/{idReserva}")
    public String modificarReserva(Reserva reserva, Model model){
        reserva = reservaService.getReserva(reserva);
        model.addAttribute("reserva", reserva);
        return "modificaReserva";
    }
    
    @GetMapping("/eliminarReserva/{idReserva}")
    public String eliminarReserva(Reserva reserva){
        reservaService.delete(reserva);
        return "redirect:/AdministradorReserva";
    }
    
   @GetMapping("/nuevoReserva")
    public String nuevoReserva(Reserva reserva) {
        return "modificaReserva";
    }

    @PostMapping("/guardarReserva")
    public String guardarReserva(Reserva reserva) {
        reservaService.save(reserva);
        return "redirect:/reservaGuardar";
    }
}
