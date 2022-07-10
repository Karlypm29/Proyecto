/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Proyecto.service;


import com.Proyecto.domain.Cliente;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface ClienteService {

    public List<Cliente> getClientes();

    public Cliente getCliente(Cliente producto);

    public void save(Cliente producto);

    public void delete(Cliente producto);

}
