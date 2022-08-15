package com.Proyecto.dao;

import com.Proyecto.domain.Usuario;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author karly
 */

public interface UsuarioDao extends CrudRepository<Usuario, Long> {
    
    Usuario findByUsername(String username);
    
    List<Usuario> findByIdRol(Long idRol);
}
