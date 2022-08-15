package com.Proyecto.controller;

import com.Proyecto.domain.Foro;
import com.Proyecto.service.ForoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ForoController {
   
    @Autowired
    private ForoService foroService;
    
    @GetMapping("/foro/listado")
    public String Inicio(Model model){
        var foros = foroService.getForos();
        model.addAttribute("totalForos",foros.size());
        model.addAttribute("foros", foros);
        return "/foro/listado";
    }
    
    @GetMapping("/foro/nuevo")
    public String nuevoForo(Foro foro){
        return "/foro/modificar";
    }
    
    @PostMapping("/foro/guardar")
    public String guardarForo(Foro foro){
        foroService.save(foro);
        return "redirect:/foro/listado";
    }
    
    @GetMapping("/foro/modificar/{idForo}")
    public String modificarForo(Foro foro, Model model){
        foro = foroService.getForo(foro);
        model.addAttribute("foro", foro);
        return "/foro/modificar";
    }
    
    @GetMapping("/foro/eliminar/{idForo}")
    public String eliminarForo(Foro foro){
        foroService.delete(foro);
        return "redirect:/foro/listado";
    }
}
