package com.Proyecto.service;

import com.Proyecto.dao.HorarioDao;
import com.Proyecto.domain.Horario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class HorarioServiceImpl implements HorarioService{
    
    @Autowired
    private HorarioDao HorarioDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Horario> getHorarios() {
        return (List<Horario>) HorarioDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Horario getHorario(Horario horario) {
        return HorarioDao.findById(horario.getIdHorario()).orElse(null);
    }
    
    @Override
    @Transactional
    public void save(Horario horario) {
        HorarioDao.save(horario);
    }

    @Override
    @Transactional
    public void delete(Horario horario) {
        HorarioDao.delete(horario);
    }
}
