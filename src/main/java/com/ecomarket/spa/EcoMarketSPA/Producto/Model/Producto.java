package com.ecomarket.spa.EcoMarketSPA.Producto.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Producto")
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
