package com.ecomarket.spa.EcoMarketSPA.Pedido.Repository;

import com.ecomarket.spa.EcoMarketSPA.Pedido.Model.Pedido;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    List<Pedido> findByClienteId(Long clienteId);
    List<Pedido> findByEstado(String estado);
}
