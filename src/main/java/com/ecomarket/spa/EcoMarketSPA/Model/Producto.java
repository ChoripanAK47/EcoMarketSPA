package com.ecomarket.spa.EcoMarketSPA.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Producto {
    private int id;
    private String nombre;
    private String marca;
    private String descripcion;
    private String categoria;
    private double precio;
    private int stock;
    private String imagenUrl;

}
