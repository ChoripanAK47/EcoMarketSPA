package com.ecomarket.spa.EcoMarketSPA.Usuario.Model;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Usuario {
    private int id;
    private String nombre;
    private String apellido;
    private String email;
    private String password;
    private String telefono;
    private String direccion;
    private String region;
    private String ciudad;
    private String codigoPostal;
    private boolean admin; // true si es administrador, false si es cliente
}
