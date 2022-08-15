/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Proyecto.dao;

import com.Proyecto.domain.Carrito;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author karly
 */
public interface CarritoDao extends CrudRepository<Carrito, Long>  {
    
    Optional<Carrito> findByIdCliente(Long idCliente);
}
