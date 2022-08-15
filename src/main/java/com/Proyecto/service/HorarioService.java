
package com.Proyecto.service;

import com.Proyecto.domain.Horario;
import java.util.List;

public interface HorarioService {

    public List<Horario> getHorarios();

    public Horario getHorario(Horario horario);

    public void save(Horario horario);

    public void delete(Horario horario);

}
