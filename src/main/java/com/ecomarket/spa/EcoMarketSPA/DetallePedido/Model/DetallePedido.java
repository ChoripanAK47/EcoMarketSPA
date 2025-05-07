
package com.ecomarket.spa.EcoMarketSPA.DetallePedido.Model;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DetallePedido {
    private int id; 
    private int pedidoId;
    private int productoId;
    private int cantidad;
    private double precioUnitario;
    private double subtotal;
}
