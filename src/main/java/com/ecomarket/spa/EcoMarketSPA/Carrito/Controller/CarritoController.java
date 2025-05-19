package com.ecomarket.spa.EcoMarketSPA.Carrito.Controller;

import com.ecomarket.spa.EcoMarketSPA.Carrito.Model.Carrito;
import com.ecomarket.spa.EcoMarketSPA.Carrito.Service.CarritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/carritos")
public class CarritoController {

    @Autowired
    private CarritoService carritoService;

    @GetMapping
    public ResponseEntity<List<Carrito>> listar() {
        List<Carrito> carritos = carritoService.findAll();
        if (carritos.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(carritos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Carrito> buscar(@PathVariable Integer id) {
        Carrito carrito = carritoService.findById(id);
        if (carrito == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(carrito);
    }

    @GetMapping("/usuario/{usuarioId}")
    public ResponseEntity<Carrito> buscarPorUsuario(@PathVariable int usuarioId) {
        Carrito carrito = carritoService.findByUsuarioId(usuarioId);
        if (carrito == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(carrito);
    }

    @PostMapping
    public ResponseEntity<Carrito> guardar(@RequestBody Carrito carrito) {
        Carrito nuevo = carritoService.save(carrito);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Carrito> actualizar(@PathVariable Integer id, @RequestBody Carrito carrito) {
        Carrito existente = carritoService.findById(id);
        if (existente == null) {
            return ResponseEntity.notFound().build();
        }
        existente.setUsuarioId(carrito.getUsuarioId());
        existente.setTotal(carrito.getTotal());
        existente.setEstado(carrito.getEstado());
        // Si tienes items, puedes actualizar la lista aquí si lo necesitas
        Carrito actualizado = carritoService.save(existente);
        return ResponseEntity.ok(actualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        Carrito existente = carritoService.findById(id);
        if (existente == null) {
            return ResponseEntity.notFound().build();
        }
        carritoService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
