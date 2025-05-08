package com.ecomarket.spa.EcoMarketSPA.Carrito.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ecomarket.spa.EcoMarketSPA.Carrito.Model.Carrito;

@Repository
public class CarritoRepository {

    private List<Carrito> listaCarritos = new ArrayList<>();

    public List<Carrito> obtenerCarritos() {
        return listaCarritos;
    }

    public Carrito guardar(Carrito carrito) {
        listaCarritos.add(carrito);
        return carrito;
    }

    public Carrito buscarPorID(int id) {
        for (Carrito carrito : listaCarritos) {
            if (carrito.getId() == id) {
                return carrito;
            }
        }
        return null;
    }

    public void eliminar(int id) {
        Carrito carrito = buscarPorID(id);
        if (carrito != null) {
            listaCarritos.remove(carrito);
        }
    }

    public Carrito actualizar(Carrito carrito) {
        for (int i = 0; i < listaCarritos.size(); i++) {
            if (listaCarritos.get(i).getId() == carrito.getId()) {
                listaCarritos.set(i, carrito);
                return carrito;
            }
        }
        return null;
    }

    public int totalCarritos() {
        return listaCarritos.size();
    }
}

