
package com.Proyecto.dao;

import com.Proyecto.domain.Reserva;
import org.springframework.data.repository.CrudRepository;

public interface ReservaDao extends CrudRepository<Reserva, Long> {
    
}
