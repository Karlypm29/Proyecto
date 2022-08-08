package com.Proyecto.dao;

import com.Proyecto.domain.Foro;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author karly
 */
public interface ForoDao extends CrudRepository<Foro, Long> {
    
}
