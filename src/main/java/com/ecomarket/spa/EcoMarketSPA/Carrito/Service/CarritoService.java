package com.ecomarket.spa.EcoMarketSPA.Carrito.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecomarket.spa.EcoMarketSPA.Carrito.Repository.CarritoRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CarritoService {

    @Autowired
    private CarritoRepository carritoRepository;

    
}
