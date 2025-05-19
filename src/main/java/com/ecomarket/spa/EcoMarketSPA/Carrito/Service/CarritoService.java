package com.ecomarket.spa.EcoMarketSPA.Carrito.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecomarket.spa.EcoMarketSPA.Carrito.Model.Carrito;
import com.ecomarket.spa.EcoMarketSPA.Carrito.Repository.CarritoRepository;

import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CarritoService {

    @Autowired
    private CarritoRepository carritoRepository;

    public List<Carrito> findAll() {
        return carritoRepository.findAll();
    }

    public Carrito findById(Integer id) {
        return carritoRepository.findById(id).orElse(null);
    }

    public Carrito findByUsuarioId(int usuarioId) {
        Optional<Carrito> carrito = carritoRepository.findByUsuarioId(usuarioId);
        return carrito.orElse(null);
    }

    public Carrito save(Carrito carrito) {
        return carritoRepository.save(carrito);
    }

    public void delete(Integer id) {
        carritoRepository.deleteById(id);
    }

    public void actualizarTotal(Carrito carrito) {
        double total = 0.0;
        if (carrito.getItems() != null) {
            for (var item : carrito.getItems()) {
                total += item.getSubtotal();
            }
        }
        carrito.setTotal(total);
        carritoRepository.save(carrito);
    }

}
