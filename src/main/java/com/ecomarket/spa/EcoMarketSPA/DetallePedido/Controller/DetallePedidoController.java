package com.ecomarket.spa.EcoMarketSPA.DetallePedido.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.ecomarket.spa.EcoMarketSPA.DetallePedido.Model.DetallePedido;
import com.ecomarket.spa.EcoMarketSPA.DetallePedido.Service.DetallePedidoService;

@RestController
@RequestMapping("/api/v1/detalles-pedido")
public class DetallePedidoController {

    @Autowired
    private DetallePedidoService detallePedidoService;

    @GetMapping
    public ResponseEntity<List<DetallePedido>> listarDetalles() {
        List<DetallePedido> detalles = detallePedidoService.findAll();
        if (detalles.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(detalles);
    }

    @PostMapping
    public ResponseEntity<DetallePedido> agregarDetalle(@RequestBody DetallePedido detallePedido) {
        DetallePedido nuevoDetalle = detallePedidoService.save(detallePedido);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoDetalle);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DetallePedido> buscarDetalle(@PathVariable Integer id) {
        DetallePedido detalle = detallePedidoService.findById(id);
        if (detalle == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(detalle);
    }

    @GetMapping("/pedido/{pedidoId}")
    public ResponseEntity<List<DetallePedido>> buscarDetallesPorPedido(@PathVariable Integer pedidoId) {
        List<DetallePedido> detalles = detallePedidoService.findByPedidoId(pedidoId);
        if (detalles.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(detalles);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DetallePedido> actualizarDetalle(@PathVariable Integer id, @RequestBody DetallePedido detallePedido) {
        DetallePedido existente = detallePedidoService.findById(id);
        if (existente == null) {
            return ResponseEntity.notFound().build();
        }
        // Actualiza los campos necesarios
        existente.setPedidoId(detallePedido.getPedidoId());
        existente.setProductoId(detallePedido.getProductoId());
        existente.setCantidad(detallePedido.getCantidad());
        existente.setPrecioUnitario(detallePedido.getPrecioUnitario());
        existente.setSubtotal(detallePedido.getSubtotal());

        DetallePedido actualizado = detallePedidoService.save(existente);
        return ResponseEntity.ok(actualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarDetalle(@PathVariable Integer id) {
        DetallePedido existente = detallePedidoService.findById(id);
        if (existente == null) {
            return ResponseEntity.notFound().build();
        }
        detallePedidoService.delete(id);
        return ResponseEntity.noContent().build();
    }
}