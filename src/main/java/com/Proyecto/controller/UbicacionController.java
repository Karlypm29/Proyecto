package com.Proyecto.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UbicacionController {
   
    @GetMapping("/ubicacion/listado")
    public String Inicio(Model model){
        
        return "/ubicacion/listado";
    }
}
