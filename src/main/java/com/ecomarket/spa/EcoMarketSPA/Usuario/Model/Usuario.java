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
    private Integer id;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String apellidos;
    @Column(unique = true, length = 13, nullable = false)
    private String rut;
    @Column(unique = true, nullable = false)
    private String email;
    @Column(unique = true, nullable = false)
    private String telefono;
    @Column(nullable = false)
    private String direccion;
    @Column(nullable = false)
    private String region;
    @Column(nullable = false)
    private String ciudad;
    @Column(nullable = false)
    private String codigoPostal;
}
