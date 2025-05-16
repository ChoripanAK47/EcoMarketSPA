package com.ecomarket.spa.EcoMarketSPA.DetallePedido.Service;

import com.ecomarket.spa.EcoMarketSPA.DetallePedido.Model.DetallePedido;
import com.ecomarket.spa.EcoMarketSPA.DetallePedido.Repository.DetallePedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class DetallePedidoService {

    @Autowired
    private DetallePedidoRepository detallePedidoRepository;

    public List<DetallePedido> findAll() {
        return detallePedidoRepository.findAll();
    }

    public DetallePedido findById(Integer id) {
        return detallePedidoRepository.findById(id).orElse(null);
    }

    public List<DetallePedido> findByPedidoId(Integer pedidoId) {
        return detallePedidoRepository.findByPedidoId(pedidoId);
    }

    public DetallePedido save(DetallePedido detallePedido) {
        return detallePedidoRepository.save(detallePedido);
    }

    public void delete(Integer id) {
        detallePedidoRepository.deleteById(id);
    }
}