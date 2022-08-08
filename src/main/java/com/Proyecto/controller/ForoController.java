package com.Proyecto.controller;

/**
 *
 * @author karly
 */
import com.Proyecto.domain.Foro;
import com.Proyecto.service.ForoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class ForoController {
    
    @Autowired
    private ForoService foroService;
    
    
    
    @GetMapping("/foroGuardar")
    public String ForoGuardar(Model model) {
        
        return "Foro";
    }
    
    @GetMapping("/foro2")
    public String ForoRedirecionar(Model model) {
        
        return "Foro";
    }
    
    @GetMapping("/AdministradorForo")
    public String Inicio(Model model){
        var foros = foroService.getForos();
        model.addAttribute("foros", foros);
        return "AdministradorForo";
    }
    
     @GetMapping("/modificarForo/{idForo}")
    public String modificarForo(Foro foro, Model model){
        foro = foroService.getForo(foro);
        model.addAttribute("foro", foro);
        return "modificaForo";
    }
    
    @GetMapping("/eliminarForo/{idForo}")
    public String eliminarForo(Foro foro){
        foroService.delete(foro);
        return "redirect:/AdministradorForo";
    }
    
   @GetMapping("/nuevoForo")
    public String nuevoForo(Foro foro) {
        return "modificaForo";
    }

    @PostMapping("/guardarForo")
    public String guardarForo(Foro foro) {
        foroService.save(foro);
        return "redirect:/foroGuardar";
    }
}
