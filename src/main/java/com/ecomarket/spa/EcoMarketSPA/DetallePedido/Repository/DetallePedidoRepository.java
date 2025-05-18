package com.ecomarket.spa.EcoMarketSPA.DetallePedido.Repository;

import com.ecomarket.spa.EcoMarketSPA.DetallePedido.Model.DetallePedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetallePedidoRepository extends JpaRepository<DetallePedido, Integer> {
    List<DetallePedido> findByPedidoId(Integer pedidoId);
}
