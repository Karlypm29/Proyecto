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
@Table(name="soporte")
public class Soporte implements Serializable {
    
    private static final long serialVersionUId = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSoporte;  //id_soporte
    private String descripcion;
    private Date fecha;
    
//    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
//    @ManyToOne
//    private Cliente cliente;

    public Soporte() {
    }

    public Soporte(String descripcion, Date fecha) {
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

//    public Soporte(String descripcion, Date fecha, Cliente cliente) {
//        this.descripcion = descripcion;
//        this.fecha = fecha;
//        this.cliente = cliente;
//    }

    

    

    
    
}
