package com.ecomarket.spa.EcoMarketSPA.Producto.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity  // Marca esta clase como una entidad JPA.
@Table(name= "producto")  // Especifica el nombre de la tabla en la base de datos.
@Data  // Genera automáticamente getters, setters, equals, hashCode y toString.
@NoArgsConstructor  // Genera un constructor sin argumentos.
@AllArgsConstructor  // Genera un constructor con un argumento por cada campo en la clase.
public class Producto {

    @Id  // Especifica el identificador primario.
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // El valor del ID se generará automáticamente.
    private Integer id;

    @Column(nullable=false)  // Define las restricciones para la columna en la tabla.
    private String nombre;

    @Column(nullable=false)  // Esta columna no puede ser nula.
    private String marca;

    @Column(nullable=false)  // Esta columna no puede ser nula.
    private String descripcion;

    @Column(nullable=false)  // Esta columna no puede ser nula.
    private String categoria;

    @Column(nullable=false)  // Esta columna no puede ser nula.
    private double precio;

    @Column(nullable=false)  // Esta columna no puede ser nula.
    private int stock;

    @Column(nullable=false)  // Esta columna no puede ser nula.
    private String imagenUrl;

}


