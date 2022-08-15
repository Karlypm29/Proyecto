
package com.Proyecto.service;

import com.Proyecto.domain.Soporte;
import java.util.List;

public interface SoporteService {

    public List<Soporte> getSoportes();

    public Soporte getSoporte(Soporte soporte);

    public void save(Soporte soporte);

    public void delete(Soporte soporte);

}
