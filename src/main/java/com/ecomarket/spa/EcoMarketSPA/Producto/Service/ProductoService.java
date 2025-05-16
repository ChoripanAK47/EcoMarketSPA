package com.ecomarket.spa.EcoMarketSPA.Producto.Service;

import com.ecomarket.spa.EcoMarketSPA.Producto.Model.Producto;
import com.ecomarket.spa.EcoMarketSPA.Producto.Repository.ProductoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ProductoService {

    @Autowired
    private ProductoRepository ProductoRepository;

    public List<Producto> findAll() {
        return ProductoRepository.findAll();
    }

    public Producto findById(long id) {
        return ProductoRepository.findById(id).get();
    }

    public Producto save(Producto producto) {
        return ProductoRepository.save(producto);
    }

    public void delete(Long id) {
        ProductoRepository.deleteById(id);
    }
}