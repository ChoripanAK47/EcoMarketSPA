package com.ecomarket.spa.EcoMarketSPA.Producto.Repository;

import com.ecomarket.spa.EcoMarketSPA.Producto.Model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
