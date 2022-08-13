
package com.Proyecto.domain;
import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Emergencias")

public class Emergencias implements Serializable {
     private static final long serialVersionUId = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmergencias; 
    
    String nombre;
    String apellidos;
    String Emergencia;

    public Emergencias() {
    }

    public Emergencias(Long idEmergencias, String nombre, String apellidos, String Emergencia) {

        this.idEmergencias = idEmergencias;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.Emergencia = Emergencia;
    }
    
    
}
