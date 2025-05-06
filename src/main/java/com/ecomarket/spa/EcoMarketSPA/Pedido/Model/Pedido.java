package com.ecomarket.spa.EcoMarketSPA.Pedido.Model;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {

    private int id;
    private String nombreCliente;
    private String direccionEnvio;
    private String metodoPago;
    private double total;
    private String estado; // "Pendiente", "Enviado", "Entregado", etc.
    private String fechaPedido; // Fecha en formato "DD-MM-YYYY"
    private String fechaEntrega; // Fecha en formato "DD-MM-YYYY"

}
