package com.ecomarket.spa.EcoMarketSPA.Usuario.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecomarket.spa.EcoMarketSPA.Usuario.Model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    Usuario findByRut(String rut);
    Usuario findByTelefono(String telefono);
}
