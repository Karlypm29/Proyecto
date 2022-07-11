/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.service;

import com.Proyecto.dao.ReservaDao;
import com.Proyecto.domain.Reserva;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author karly
 */
@Service
public class ReservaServiceImpl implements ReservaService{
    
    @Autowired
    private ReservaDao ReservaDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Reserva> getReservas() {
        return (List<Reserva>) ReservaDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Reserva getReserva(Reserva reserva) {
        return ReservaDao.findById(reserva.getIdReserva()).orElse(null);
    }
    
    @Override
    @Transactional
    public void save(Reserva reserva) {
        ReservaDao.save(reserva);
    }

    @Override
    @Transactional
    public void delete(Reserva reserva) {
        ReservaDao.delete(reserva);
    }
}
