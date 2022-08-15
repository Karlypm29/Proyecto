
package com.Proyecto.service;

import com.Proyecto.domain.Emergencia;
import java.util.List;

public interface EmergenciaService {

    public List<Emergencia> getEmergencias();

    public Emergencia getEmergencia(Emergencia emergencia);

    public void save(Emergencia emergencia);

    public void delete(Emergencia emergencia);

}
