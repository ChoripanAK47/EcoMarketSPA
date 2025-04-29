package com.ecomarket.spa.EcoMarketSPA.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecomarket.spa.EcoMarketSPA.Model.Producto;
import com.ecomarket.spa.EcoMarketSPA.Repository.ProductoRepository;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> getProductos() {
        return productoRepository.obtenerProductos();
    }

    public Producto saveProducto(Producto producto) {
        return productoRepository.guardar(producto);
    }

    public Producto getProductoID(int id) {
        return productoRepository.buscarPorID(id);
    }

    public Producto getProducto(String nombre) {
        return productoRepository.buscarPorNombre(nombre);
    }

    public Producto updateProducto(Producto producto) {
        return productoRepository.actualizar(producto);
    }
    
    public String deleteProducto(int id) {
        productoRepository.eliminar(id);
        return "Producto Eliminado";
    }

    public int totalProductos1() {
        return productoRepository.totalProductos();
    }
    
}
