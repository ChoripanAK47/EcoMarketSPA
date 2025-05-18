package com.ecomarket.spa.EcoMarketSPA.Carrito.Model;

import java.util.ArrayList;
import java.util.List;

import com.ecomarket.spa.EcoMarketSPA.DetallePedido.Model.DetallePedido; // Importación necesaria

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Carrito {
    private int id; 
    private int usuarioId; 
    private List<DetallePedido> detalles = new ArrayList<>(); 
}