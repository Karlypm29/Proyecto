/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Proyecto.service;

import com.Proyecto.domain.Articulo;
import com.Proyecto.domain.CarritoDetalle;
import java.util.List;

/**
 *
 * @author karly
 */

public interface CarritoDetalleService {
    CarritoDetalle getCarritoDetalle(Long idCarrito, Articulo articulo);
    public List<CarritoDetalle> getCarritoDetalles(Long idCarrito);
    public void save(CarritoDetalle carritoDetalle);
    public void delete(CarritoDetalle carritoDetalle);
    public void deleteAll(Long idCarrito);
}
