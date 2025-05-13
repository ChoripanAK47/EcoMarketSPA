package com.ecomarket.spa.EcoMarketSPA.Usuario.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecomarket.spa.EcoMarketSPA.Usuario.Model.Usuario;
import com.ecomarket.spa.EcoMarketSPA.Usuario.Repository.UsuarioRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;
    
    public List<Usuario> obtenerUsuarios() {
        return usuarioRepository.findAll();
    }
    public Usuario obtenerUsuarioPorId(Long id) {
        return usuarioRepository.findById(id).get();
    }
    public void eliminarUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }
    public void guardarUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }
    
}
