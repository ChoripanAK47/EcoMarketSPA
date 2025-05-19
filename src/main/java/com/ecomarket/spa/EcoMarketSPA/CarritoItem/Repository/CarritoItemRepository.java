package com.ecomarket.spa.EcoMarketSPA.CarritoItem.Repository;

import com.ecomarket.spa.EcoMarketSPA.CarritoItem.Model.CarritoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarritoItemRepository extends JpaRepository<CarritoItem, Integer> {
    List<CarritoItem> findByCarritoId(Integer carritoId);
}
