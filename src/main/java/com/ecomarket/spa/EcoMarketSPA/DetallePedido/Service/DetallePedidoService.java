package com.ecomarket.spa.EcoMarketSPA.DetallePedido.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecomarket.spa.EcoMarketSPA.DetallePedido.Model.DetallePedido;
import com.ecomarket.spa.EcoMarketSPA.DetallePedido.Repository.DetallePedidoRepository;

@Service
public class DetallePedidoService {

    @Autowired
    private DetallePedidoRepository detallePedidoRepository;

    public List<DetallePedido> getDetalles() {
        return detallePedidoRepository.obtenerDetalles();
    }

    public DetallePedido saveDetalle(DetallePedido detallePedido) {
        return detallePedidoRepository.guardar(detallePedido);
    }

    public DetallePedido getDetalleByID(int id) {
        return detallePedidoRepository.buscarPorID(id);
    }

    public List<DetallePedido> getDetallesByPedidoID(int pedidoId) {
        return detallePedidoRepository.buscarPorPedidoID(pedidoId);
    }

    public DetallePedido updateDetalle(DetallePedido detallePedido) {
        return detallePedidoRepository.actualizar(detallePedido);
    }

    public String deleteDetalle(int id) {
        detallePedidoRepository.eliminar(id);
        return "Detalle eliminado";
    }

    public int totalDetalles() {
        return detallePedidoRepository.totalDetalles();
    }
}