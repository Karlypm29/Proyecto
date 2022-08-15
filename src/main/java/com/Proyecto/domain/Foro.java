package com.Proyecto.domain;

/**
 *
 * @author Karly
 */
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="foro")
public class Foro implements Serializable {
    
    private static final long serialVersionUId = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idForo;  //id_foro
    private String titulo;
    private String descripcion;

    public Foro() {
    }

    public Foro(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
    }
    
    

    

    
    
}
