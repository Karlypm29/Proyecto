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
@Table(name="notificacion")
public class Notificacion implements Serializable {
    
    private static final long serialVersionUId = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idNotificacion;  //id_notificacion
    private String titulo;
    private String descripcion;

    public Notificacion() {
    }

    public Notificacion(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    

    
    
}
