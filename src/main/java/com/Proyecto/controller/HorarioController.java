package com.Proyecto.controller;

import com.Proyecto.domain.Horario;
import com.Proyecto.service.HorarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HorarioController {
   
    @Autowired
    private HorarioService horarioService;
    
    @GetMapping("/horario/listado")
    public String Inicio(Model model){
        var horarios = horarioService.getHorarios();
        model.addAttribute("totalHorarios",horarios.size());
        model.addAttribute("horarios", horarios);
        return "/horario/listado";
    }
    
    @GetMapping("/horario/nuevo")
    public String nuevoHorario(Horario horario){
        return "/horario/modificar";
    }
    
    @PostMapping("/horario/guardar")
    public String guardarHorario(Horario horario){
        horarioService.save(horario);
        return "redirect:/horario/listado";
    }
    
    @GetMapping("/horario/modificar/{idHorario}")
    public String modificarHorario(Horario horario, Model model){
        horario = horarioService.getHorario(horario);
        model.addAttribute("horario", horario);
        return "/horario/modificar";
    }
    
    @GetMapping("/horario/eliminar/{idHorario}")
    public String eliminarHorario(Horario horario){
        horarioService.delete(horario);
        return "redirect:/horario/listado";
    }
}
