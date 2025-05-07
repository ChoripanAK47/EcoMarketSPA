package com.ecomarket.spa.EcoMarketSPA.DetallePedido.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ecomarket.spa.EcoMarketSPA.DetallePedido.Model.DetallePedido;
import com.ecomarket.spa.EcoMarketSPA.DetallePedido.Service.DetallePedidoService;

@RestController
@RequestMapping("/api/v1/detalles-pedido")
public class DetallePedidoController {

    @Autowired
    private DetallePedidoService detallePedidoService;

    @GetMapping
    public List<DetallePedido> listarDetalles() {
        return detallePedidoService.getDetalles();
    }

    @PostMapping
    public DetallePedido agregarDetalle(@RequestBody DetallePedido detallePedido) {
        return detallePedidoService.saveDetalle(detallePedido);
    }

    @GetMapping("/id/{id}")
    public DetallePedido buscarDetalle(@PathVariable int id) {
        return detallePedidoService.getDetalleByID(id);
    }

    @GetMapping("/pedido/{pedidoId}")
    public List<DetallePedido> buscarDetallesPorPedido(@PathVariable int pedidoId) {
        return detallePedidoService.getDetallesByPedidoID(pedidoId);
    }

    @PutMapping("{id}")
    public DetallePedido actualizarDetalle(@PathVariable int id, @RequestBody DetallePedido detallePedido) {
        return detallePedidoService.updateDetalle(detallePedido);
    }

    @DeleteMapping("{id}")
    public String eliminarDetalle(@PathVariable int id) {
        return detallePedidoService.deleteDetalle(id);
    }

    @GetMapping("/total")
    public int totalDetalles() {
        return detallePedidoService.totalDetalles();
    }
}