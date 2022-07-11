
package com.Proyecto.service;

import com.Proyecto.domain.Reserva;
import java.util.List;

public interface ReservaService {

    public List<Reserva> getReservas();

    public Reserva getReserva(Reserva producto);

    public void save(Reserva producto);

    public void delete(Reserva producto);

}
