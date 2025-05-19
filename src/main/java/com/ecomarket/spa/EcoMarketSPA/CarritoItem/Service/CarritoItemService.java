package com.ecomarket.spa.EcoMarketSPA.CarritoItem.Service;

import com.ecomarket.spa.EcoMarketSPA.CarritoItem.Model.CarritoItem;
import com.ecomarket.spa.EcoMarketSPA.CarritoItem.Repository.CarritoItemRepository;
import com.ecomarket.spa.EcoMarketSPA.Carrito.Model.Carrito;
import com.ecomarket.spa.EcoMarketSPA.Carrito.Service.CarritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CarritoItemService {

    @Autowired
    private CarritoItemRepository carritoItemRepository;

    @Autowired
    private CarritoService carritoService;

    public List<CarritoItem> findAll() {
        return carritoItemRepository.findAll();
    }

    public CarritoItem findById(Integer id) {
        return carritoItemRepository.findById(id).orElse(null);
    }

    public List<CarritoItem> findByCarritoId(Integer carritoId) {
        return carritoItemRepository.findByCarritoId(carritoId);
    }

    public CarritoItem save(CarritoItem carritoItem) {
        CarritoItem saved = carritoItemRepository.save(carritoItem);
        // Actualiza el total del carrito después de guardar el ítem
        Carrito carrito = saved.getCarrito();
        carritoService.actualizarTotal(carrito);
        return saved;
    }

    public void delete(Integer id) {
        CarritoItem item = carritoItemRepository.findById(id).orElse(null);
        if (item != null) {
            Carrito carrito = item.getCarrito();
            carritoItemRepository.deleteById(id);
            // Actualiza el total del carrito después de eliminar el ítem
            carritoService.actualizarTotal(carrito);
        }
    }
}
