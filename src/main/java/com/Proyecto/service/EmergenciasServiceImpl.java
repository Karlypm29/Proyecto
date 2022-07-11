/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.service;

import com.Proyecto.dao.EmergenciasDao;
import com.Proyecto.domain.Emergencias;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Jose Ignacio
 */
public class EmergenciasServiceImpl implements EmergenciasService{

    @Autowired
    private EmergenciasDao EmergenciasDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Emergencias> getEmergencias() {
        return (List<Emergencias>) EmergenciasDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Emergencias getEmergencias(Emergencias emergencias) {
        return EmergenciasDao.findById(emergencias.getIdEmergencias()).orElse(null);
    }
    
    @Override
    @Transactional
    public void save(Emergencias emergencias) {
        EmergenciasDao.save(emergencias);
    }

    @Override
    @Transactional
    public void delete(Emergencias emergencias) {
        EmergenciasDao.delete(emergencias);
    }
}
