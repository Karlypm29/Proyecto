
package com.Proyecto.dao;

import com.Proyecto.domain.Cliente;
import org.springframework.data.repository.CrudRepository;
/**
 *
 * @author karly
 */
public interface ClienteDao extends CrudRepository<Cliente, Long> {
    
}
