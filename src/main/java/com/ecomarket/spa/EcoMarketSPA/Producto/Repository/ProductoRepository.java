package com.ecomarket.spa.EcoMarketSPA.Producto.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ecomarket.spa.EcoMarketSPA.Producto.Model.Producto;

@Repository
public class ProductoRepository {
    //Crear lista para guardar los productos
    private List<Producto> listaProductos = new ArrayList<>();
    //Crear Objetos y agregarlos a la lista
    public ProductoRepository() {
        listaProductos.add(new Producto(1, "Carne de Soya", "SoyaCat", "Carne de soya de suprema calidad", "Vegano", 3000, 50, "duoc.cl"));
        listaProductos.add(new Producto(2, "Galletas de Soya", "Gran Soyazo", "Galletas golazo de soya", "Vegano", 2000, 25, "duoc.cl"));
        listaProductos.add(new Producto(3, "Leche de Soya", "SoyaCat", "Leche de soya de suprema calidad", "Vegano", 1500, 100, "duoc.cl"));
        listaProductos.add(new Producto(4, "Carne de Res", "ResCat", "Carne de res de suprema calidad", "Carnivoro", 5000, 50, "duoc.cl"));
    }
    //Retornar productos en la lista
    public List<Producto> obtenerProductos() {
        return listaProductos;
    }
    //Buscar por ID
    public Producto buscarPorID(int id) {
        for (Producto producto : listaProductos) {
            if (producto.getId() == id) {
                return producto;
            }
        }
        return null;
    }
    //Buscar por Marca
    public Producto buscarPorMarca(String marca) {
        for (Producto producto : listaProductos) {
            if (producto.getMarca().equals(marca)) {
                return producto;
            }
        }
        return null;
    }
    //Buscar por Categoria
    public Producto buscarPorCategoria(String categoria) {
        for (Producto producto : listaProductos) {
            if (producto.getCategoria().equals(categoria)) {
                return producto;
            }
        }
        return null;
    }
    //Buscar por Nombre
    public Producto buscarPorNombre(String nombre) {
        for (Producto producto : listaProductos) {
            if (producto.getNombre().equals(nombre)) {
                return producto;
            }
        }
        return null;
    }
    //Guardar Productos
    public Producto guardar(Producto prod) {
        listaProductos.add(prod);
        return prod;
    }
    //Eliminar Productos
    public void eliminar(int id) {
        Producto producto = buscarPorID(id);
        if (producto != null) {
            listaProductos.remove(producto);
        }
    }
    //Mostrar total de Productos
    public int totalProductos() {
        return listaProductos.size();
    }
    //Actualizar Productos
    public Producto actualizar(Producto prod) {
        int id = 0;
        int idPosicion = 0;
        for (int i = 0; i < listaProductos.size(); i++) {
            if (listaProductos.get(i).getId() == prod.getId()) {
                id = prod.getId();
                idPosicion = i;
            }
        }
        Producto producto1 = new Producto();
        producto1.setId(id);
        producto1.setNombre(prod.getNombre());
        producto1.setMarca(prod.getMarca());
        producto1.setDescripcion(prod.getDescripcion());
        producto1.setCategoria(prod.getCategoria());
        producto1.setPrecio(prod.getPrecio());
        producto1.setStock(prod.getStock());
        producto1.setImagenUrl(prod.getImagenUrl());

        listaProductos.set(idPosicion, producto1);
        return producto1;
    }

    public Producto buscarPorNombre2(String nombre) {
        for (Producto producto : listaProductos) {
            if (producto.getNombre().contains(nombre)) {
                return producto;
            }
        }
        return null;
    }
}   
