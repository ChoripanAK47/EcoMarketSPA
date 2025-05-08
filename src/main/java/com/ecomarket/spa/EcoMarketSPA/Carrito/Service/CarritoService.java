package com.ecomarket.spa.EcoMarketSPA.Carrito.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecomarket.spa.EcoMarketSPA.Carrito.Model.Carrito;
import com.ecomarket.spa.EcoMarketSPA.Carrito.Repository.CarritoRepository;

@Service
public class CarritoService {

    @Autowired
    private CarritoRepository carritoRepository;

    public List<Carrito> getCarritos() {
        return carritoRepository.obtenerCarritos();
    }

    public Carrito saveCarrito(Carrito carrito) {
        return carritoRepository.guardar(carrito);
    }

    public Carrito getCarritoByID(int id) {
        return carritoRepository.buscarPorID(id);
    }

    public Carrito updateCarrito(Carrito carrito) {
        return carritoRepository.actualizar(carrito);
    }

    public String deleteCarrito(int id) {
        carritoRepository.eliminar(id);
        return "Carrito eliminado";
    }

    public int totalCarritos() {
        return carritoRepository.totalCarritos();
    }
}
