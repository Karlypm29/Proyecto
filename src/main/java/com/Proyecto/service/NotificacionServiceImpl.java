package com.Proyecto.service;

import com.Proyecto.dao.NotificacionDao;
import com.Proyecto.domain.Notificacion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NotificacionServiceImpl implements NotificacionService{
    
    @Autowired
    private NotificacionDao NotificacionDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Notificacion> getNotificacions() {
        return (List<Notificacion>) NotificacionDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Notificacion getNotificacion(Notificacion notificacion) {
        return NotificacionDao.findById(notificacion.getIdNotificacion()).orElse(null);
    }
    
    @Override
    @Transactional
    public void save(Notificacion notificacion) {
        NotificacionDao.save(notificacion);
    }

    @Override
    @Transactional
    public void delete(Notificacion notificacion) {
        NotificacionDao.delete(notificacion);
    }
}
