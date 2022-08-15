package com.Proyecto.service;

import com.Proyecto.domain.Carrito;

/**
 *
 * @author karly
 */
public interface CarritoService {
    
    public Carrito getCarrito(Carrito carrito);
    
    public Carrito getCarritoCliente(long idCliente);
}
