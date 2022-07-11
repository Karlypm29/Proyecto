/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
@Table(name="reserva")
public class Reserva implements Serializable{
    
    private static final long serialVersionUId = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReserva; //Si lo ponemos asi idReserva lo que pasa que esa C en mauscula pasaa minuscula
                            //y sepone un guio entonces queda asi id_reserva
    int idCliente;
    String nombre;
    String apellido1;
    String apellido2;
    String Correo;
    Date fechaReserva;
    String descripcion;
    
//    @JoinColumn(name="id_cliente", referencedColumnName = "id_cliente")
//    @ManyToOne
//    private Cliente cliente;
    public Reserva() {
    }

    public Reserva(int idCliente, String nombre, String apellido1, String apellido2, String Correo, Date fechaReserva, String descripcion) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.Correo = Correo;
        this.fechaReserva = fechaReserva;
        this.descripcion = descripcion;
    }

    
    
}
