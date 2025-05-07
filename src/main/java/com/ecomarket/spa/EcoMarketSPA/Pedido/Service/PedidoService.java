package com.ecomarket.spa.EcoMarketSPA.Pedido.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecomarket.spa.EcoMarketSPA.Pedido.Model.Pedido;
import com.ecomarket.spa.EcoMarketSPA.Pedido.Repository.PedidoRepository;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public List<Pedido> getPedidos() {
        return pedidoRepository.obtenerlistaPedidos();
    }

    public Pedido savePedido(Pedido pedido) {
        return pedidoRepository.guardar(pedido);
    }

    public Pedido getPedidoByID(int id) {
        return pedidoRepository.buscarPorID(id);
    }

    public Pedido updatePedido(Pedido pedido) {
        return pedidoRepository.actualizar(pedido);
    }

    public String deletePedido(int id) {
        pedidoRepository.eliminar(id);
        return "Pedido eliminado";
    }

    public int totalPedidos() {
        return pedidoRepository.totallistaPedidos();
    }
}
