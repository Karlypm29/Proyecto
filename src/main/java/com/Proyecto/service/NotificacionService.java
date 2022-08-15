package com.Proyecto.service;

import com.Proyecto.domain.Notificacion;
import java.util.List;

public interface NotificacionService {

    public List<Notificacion> getNotificacions();

    public Notificacion getNotificacion(Notificacion notificacion);

    public void save(Notificacion notificacion);

    public void delete(Notificacion notificacion);

}
