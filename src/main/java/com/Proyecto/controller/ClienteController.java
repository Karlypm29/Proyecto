package com.Proyecto.controller;

import com.Proyecto.domain.Cliente;
import com.Proyecto.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClienteController {
    
    @Autowired
    private ClienteService clienteService;
    
    @GetMapping("/AdministradorCliente")
    public String Inicio(Model model){
        var clientes = clienteService.getClientes();
        model.addAttribute("clientes", clientes);
        return "AdministradorCliente";
    }
    
     @GetMapping("/modificarCliente/{idCliente}")
    public String modificarCliente(Cliente cliente, Model model){
        cliente = clienteService.getCliente(cliente);
        model.addAttribute("cliente", cliente);
        return "modifica";
    }
    
    @GetMapping("/eliminarCliente/{idCliente}")
    public String eliminarCliente(Cliente cliente){
        clienteService.delete(cliente);
        return "redirect:/AdministradorCliente";
    }
}
