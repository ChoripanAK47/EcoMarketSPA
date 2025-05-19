package com.ecomarket.spa.EcoMarketSPA.CarritoItem.Controller;

import com.ecomarket.spa.EcoMarketSPA.CarritoItem.Model.CarritoItem;
import com.ecomarket.spa.EcoMarketSPA.CarritoItem.Service.CarritoItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/carrito-items")
public class CarritoItemController {

    @Autowired
    private CarritoItemService carritoItemService;

    @GetMapping
    public ResponseEntity<List<CarritoItem>> listar() {
        List<CarritoItem> items = carritoItemService.findAll();
        if (items.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(items);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CarritoItem> buscar(@PathVariable Integer id) {
        CarritoItem item = carritoItemService.findById(id);
        if (item == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(item);
    }

    @GetMapping("/carrito/{carritoId}")
    public ResponseEntity<List<CarritoItem>> buscarPorCarrito(@PathVariable Integer carritoId) {
        List<CarritoItem> items = carritoItemService.findByCarritoId(carritoId);
        if (items.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(items);
    }

    @PostMapping
    public ResponseEntity<CarritoItem> agregar(@RequestBody CarritoItem carritoItem) {
        CarritoItem nuevo = carritoItemService.save(carritoItem);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CarritoItem> actualizar(@PathVariable Integer id, @RequestBody CarritoItem carritoItem) {
        CarritoItem existente = carritoItemService.findById(id);
        if (existente == null) {
            return ResponseEntity.notFound().build();
        }
        existente.setProductoId(carritoItem.getProductoId());
        existente.setCantidad(carritoItem.getCantidad());
        existente.setPrecioUnitario(carritoItem.getPrecioUnitario());
        existente.setSubtotal(carritoItem.getSubtotal());
        // Si tienes relación con Carrito, también puedes actualizarlo aquí si es necesario
        CarritoItem actualizado = carritoItemService.save(existente);
        return ResponseEntity.ok(actualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        CarritoItem existente = carritoItemService.findById(id);
        if (existente == null) {
            return ResponseEntity.notFound().build();
        }
        carritoItemService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
