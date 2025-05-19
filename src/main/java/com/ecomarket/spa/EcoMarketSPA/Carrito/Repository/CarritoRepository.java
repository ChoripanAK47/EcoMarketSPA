package com.ecomarket.spa.EcoMarketSPA.Carrito.Repository;

import com.ecomarket.spa.EcoMarketSPA.Carrito.Model.Carrito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CarritoRepository extends JpaRepository<Carrito, Integer> {
    Optional<Carrito> findByUsuarioId(int usuarioId);
}
