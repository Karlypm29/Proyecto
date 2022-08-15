/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.domain;

/**
 *
 * @author Jose Ignacio
 */
import java.io.Serializable;
import javax.persistence.Column;
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
@Table(name="articulo")
public class Articulo implements Serializable {
    
    private static final long serialVersionUId = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_articulo")
    private Long idArticulo;  //id_articulo
    private String descripcion;
    private String detalle;
    private double precio;
    
//    @JoinColumn(name="id_categoria", referencedColumnName = "id_categoria")
//    @ManyToOne
//    private Categoria categoria;

    public Articulo() {
    }

    public Articulo(String descripcion, String detalle, double precio) {
        this.descripcion = descripcion;
        this.detalle = detalle;
        this.precio = precio;
    }

    
    
    
//    public Articulo(String descripcion, String detalle, double precio, Categoria categoria) {
//        this.descripcion = descripcion;
//        this.detalle = detalle;
//        this.precio = precio;
//        this.categoria = categoria;
//    }

    
    
}
