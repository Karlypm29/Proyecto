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
/**
 *
 * @author karly
 */
@Data
@Entity
@Table(name="foro")
public class Foro implements Serializable{
    
    private static final long serialVersionUId = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idForo; //Si lo ponemos asi idForo lo que pasa que esa C en mauscula pasaa minuscula
                            //y sepone un guio entonces queda asi id_foro
    int idCliente;
    String tituloforo;
    String descripcion;
    
//    @JoinColumn(name="id_cliente", referencedColumnName = "id_cliente")
//    @ManyToOne
//    private Cliente cliente;
    public Foro() {
    }

    public Foro(Long idForo, int idCliente, String tituloforo, String apellido1, String descripcion) {
        this.idForo = idForo;
        this.idCliente = idCliente;
        this.tituloforo = tituloforo;
        this.descripcion = descripcion;
    }

    

    
    
}
