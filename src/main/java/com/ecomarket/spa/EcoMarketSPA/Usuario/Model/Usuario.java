package com.ecomarket.spa.EcoMarketSPA.Usuario.Model;

import lombok.Data;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Usuario")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Usuario {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String apellido;
    @Column(unique = true, length = 13, nullable = false)
    private String rut;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String telefono;
    @Column(nullable = false)
    private String direccion;
    @Column(nullable = false)
    private String region;
    @Column(nullable = false)
    private String ciudad;
    @Column(nullable = false)
    private String codigoPostal;
    private boolean admin; // true si es administrador, false si es cliente
}
