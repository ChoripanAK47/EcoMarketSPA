package com.ecomarket.spa.EcoMarketSPA.Usuario.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecomarket.spa.EcoMarketSPA.Usuario.Model.Usuario;
import com.ecomarket.spa.EcoMarketSPA.Usuario.Repository.UsuarioRepository1;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UsuarioService1 {

    @Autowired
    private UsuarioRepository1 usuarioRepository1;
    
    public List<Usuario> obtenerUsuarios() {
        return usuarioRepository1.findAll();
    }
    public Usuario obtenerUsuarioPorId(Long id) {
        return usuarioRepository1.findById(id).get();
    }
    public void eliminarUsuario(Long id) {
        usuarioRepository1.deleteById(id);
    }
    public void guardarUsuario(Usuario usuario) {
        usuarioRepository1.save(usuario);
    }
    
}
