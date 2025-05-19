package com.ecomarket.spa.EcoMarketSPA.Carrito.Model;

import java.util.List;

import com.ecomarket.spa.EcoMarketSPA.CarritoItem.Model.CarritoItem;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Carrito")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Carrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true, nullable = false)
    private int usuarioId;

    @Column(nullable = false)
    private double total;

    @Column(nullable = false)
    private String estado;

    @OneToMany(mappedBy = "carritoId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CarritoItem> items;
}