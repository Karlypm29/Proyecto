package com.Proyecto.service;

import com.Proyecto.dao.EmergenciaDao;
import com.Proyecto.domain.Emergencia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmergenciaServiceImpl implements EmergenciaService{
    
    @Autowired
    private EmergenciaDao EmergenciaDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Emergencia> getEmergencias() {
        return (List<Emergencia>) EmergenciaDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Emergencia getEmergencia(Emergencia emergencia) {
        return EmergenciaDao.findById(emergencia.getIdEmergencia()).orElse(null);
    }
    
    @Override
    @Transactional
    public void save(Emergencia emergencia) {
        EmergenciaDao.save(emergencia);
    }

    @Override
    @Transactional
    public void delete(Emergencia emergencia) {
        EmergenciaDao.delete(emergencia);
    }
}
