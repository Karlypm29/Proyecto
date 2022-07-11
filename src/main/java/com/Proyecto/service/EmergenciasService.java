/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Proyecto.service;

import com.Proyecto.domain.Emergencias;
import java.util.List;

public interface EmergenciasService {
    
    public List<Emergencias> getEmergencias();

    public Emergencias getEmergencias(Emergencias producto);

    public void save(Emergencias producto);

    public void delete(Emergencias producto);

}
    

