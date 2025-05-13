package com.ecomarket.spa.EcoMarketSPA.Usuario.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecomarket.spa.EcoMarketSPA.Usuario.Model.Usuario;

@Repository
public interface UsuarioRepository1 extends JpaRepository<Usuario, Long>{
}
