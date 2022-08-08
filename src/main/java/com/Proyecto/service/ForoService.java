package com.Proyecto.service;

import com.Proyecto.domain.Foro;
import java.util.List;

/**
 *
 * @author karly
 */

public interface ForoService {

    public List<Foro> getForos();

    public Foro getForo(Foro foro);

    public void save(Foro foro);

    public void delete(Foro foro);

}
