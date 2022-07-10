package com.Proyecto.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;



@Data
@Entity
@Table(name="cliente")

public class Cliente implements Serializable{
    
    private static final long serialVersionUId = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente; //Si lo ponemos asi idCliente lo que pasa que esa C en mauscula pasaa minuscula
                            //y sepone un guio entonces queda asi id_cliente
    String Correo;
    String contrasena;

    public Cliente() {
    }

    public Cliente(String Correo, String contraseña) {
        this.Correo = Correo;
        this.contrasena = contraseña;
    }
    
}
