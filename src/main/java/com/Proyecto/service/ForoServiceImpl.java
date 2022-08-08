package com.Proyecto.service;

import com.Proyecto.dao.ForoDao;
import com.Proyecto.domain.Foro;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author karly
 */
@Service
public class ForoServiceImpl implements ForoService{
    
    @Autowired
    private ForoDao ForoDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Foro> getForos() {
        return (List<Foro>) ForoDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Foro getForo(Foro foro) {
        return ForoDao.findById(foro.getIdForo()).orElse(null);
    }
    
    @Override
    @Transactional
    public void save(Foro foro) {
        ForoDao.save(foro);
    }

    @Override
    @Transactional
    public void delete(Foro foro) {
        ForoDao.delete(foro);
    }
}