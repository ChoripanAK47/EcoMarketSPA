package com.ecomarket.spa.EcoMarketSPA.Carrito.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ecomarket.spa.EcoMarketSPA.Carrito.Model.Carrito;
import com.ecomarket.spa.EcoMarketSPA.Carrito.Service.CarritoService;

@RestController
@RequestMapping("/api/v1/carritos")
public class CarritoController {

    @Autowired
    private CarritoService carritoService;

    @GetMapping
    public List<Carrito> listarCarritos() {
        return carritoService.getCarritos();
    }

    @PostMapping
    public Carrito agregarCarrito(@RequestBody Carrito carrito) {
        return carritoService.saveCarrito(carrito);
    }

    @GetMapping("/id/{id}")
    public Carrito buscarCarrito(@PathVariable int id) {
        return carritoService.getCarritoByID(id);
    }

    @PutMapping("{id}")
    public Carrito actualizarCarrito(@PathVariable int id, @RequestBody Carrito carrito) {
        carrito.setId(id);
        return carritoService.updateCarrito(carrito);
    }

    @DeleteMapping("{id}")
    public String eliminarCarrito(@PathVariable int id) {
        return carritoService.deleteCarrito(id);
    }

    @GetMapping("/total")
    public int totalCarritos() {
        return carritoService.totalCarritos();
    }
}

