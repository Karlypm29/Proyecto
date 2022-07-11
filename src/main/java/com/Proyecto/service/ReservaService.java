/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Proyecto.service;

import com.Proyecto.domain.Reserva;
import java.util.List;

/**
 *
 * @author karly
 */

public interface ReservaService {

    public List<Reserva> getReservas();

    public Reserva getReserva(Reserva producto);

    public void save(Reserva producto);

    public void delete(Reserva producto);

}
