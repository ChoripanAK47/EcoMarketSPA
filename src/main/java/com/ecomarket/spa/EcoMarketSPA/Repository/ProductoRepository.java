package com.ecomarket.spa.EcoMarketSPA.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ecomarket.spa.EcoMarketSPA.Model.Producto;

@Repository
public class ProductoRepository {
    
    private List<Producto> listaProductos = new ArrayList<>();

    public ProductoRepository() {
        listaProductos.add(new Producto(1, "Carne de Soya", "SoyaCat", "Carne de soya de suprema calidad", "Vegano", 3000, 50, "duoc.cl"));
    }

    public List<Producto> obtenerProductos() {
        return listaProductos;
    }

    public Producto buscarPorID(int id) {
        for (Producto producto : listaProductos) {
            if (producto.getId() == id) {
                return producto;
            }
        }
        return null;
    }
}   
