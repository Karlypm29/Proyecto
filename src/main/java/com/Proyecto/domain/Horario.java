package com.Proyecto.domain;

/**
 *
 * @author Karly
 */
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
@Table(name="horario")
public class Horario implements Serializable {
    
    private static final long serialVersionUId = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHorario;  //id_horario
    private String dia;
    private String abierto;
    private String cerrado;

    public Horario() {
    }

    public Horario(String dia, String abierto, String cerrado) {
        this.dia = dia;
        this.abierto = abierto;
        this.cerrado = cerrado;
    }

    

    

    

    
    
}
