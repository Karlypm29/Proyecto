/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Proyecto.dao;

/**
 *
 * @author Jose Ignacio
 */
import com.Proyecto.domain.Credito;
import org.springframework.data.repository.CrudRepository;

public interface CreditoDao extends CrudRepository<Credito, Long>{
   
}