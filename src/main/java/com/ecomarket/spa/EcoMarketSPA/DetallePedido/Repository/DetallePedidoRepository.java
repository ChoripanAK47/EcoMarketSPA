package com.ecomarket.spa.EcoMarketSPA.DetallePedido.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ecomarket.spa.EcoMarketSPA.DetallePedido.Model.DetallePedido;

@Repository
public class DetallePedidoRepository {

    private List<DetallePedido> listaDetalles = new ArrayList<>();

    public List<DetallePedido> obtenerDetalles() {
        return listaDetalles;
    }

    public DetallePedido guardar(DetallePedido detallePedido) {
        listaDetalles.add(detallePedido);
        return detallePedido;
    }

    public DetallePedido buscarPorID(int id) {
        for (DetallePedido detalle : listaDetalles) {
            if (detalle.getId() == id) {
                return detalle;
            }
        }
        return null;
    }

    public List<DetallePedido> buscarPorPedidoID(int pedidoId) {
        List<DetallePedido> detallesPedido = new ArrayList<>();
        for (DetallePedido detalle : listaDetalles) {
            if (detalle.getPedidoId() == pedidoId) {
                detallesPedido.add(detalle);
            }
        }
        return detallesPedido;
    }

    public DetallePedido actualizar(DetallePedido detallePedido) {
        for (int i = 0; i < listaDetalles.size(); i++) {
            if (listaDetalles.get(i).getId() == detallePedido.getId()) {
                listaDetalles.set(i, detallePedido);
                return detallePedido;
            }
        }
        return null;
    }

    public void eliminar(int id) {
        DetallePedido detalle = buscarPorID(id);
        if (detalle != null) {
            listaDetalles.remove(detalle);
        }
    }

    public int totalDetalles() {
        return listaDetalles.size();
    }
}
