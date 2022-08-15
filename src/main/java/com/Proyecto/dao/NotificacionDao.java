
package com.Proyecto.dao;

import com.Proyecto.domain.Notificacion;
import org.springframework.data.repository.CrudRepository;

public interface NotificacionDao extends CrudRepository<Notificacion, Long> {
    
}
