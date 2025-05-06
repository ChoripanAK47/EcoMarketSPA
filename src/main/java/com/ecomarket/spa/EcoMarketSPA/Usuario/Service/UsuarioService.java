package com.ecomarket.spa.EcoMarketSPA.Usuario.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecomarket.spa.EcoMarketSPA.Usuario.Model.Usuario;
import com.ecomarket.spa.EcoMarketSPA.Usuario.Repository.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;
    public List<Usuario> getUsuarios() {
        return usuarioRepository.obtenerUsuarios();
    }
    public Usuario saveUsuario(Usuario usuario) {
        return usuarioRepository.guardar(usuario);
    }
    public Usuario getUsuarioID(int id) {
        return usuarioRepository.buscarPorID(id);
    }
    public Usuario getUsuario(String nombre) {
        return usuarioRepository.buscarPorNombre(nombre);
    }
    public Usuario updateUsuario(Usuario usuario) {
        return usuarioRepository.actualizar(usuario);
    }
    public String deleteUsuario(int id) {
        usuarioRepository.eliminar(id);
        return "Usuario Eliminado";
    }
    public int totalUsuarios() {
        return usuarioRepository.totalUsuarios();
    }
    public Usuario getUsuarioEmail(String email) {
        return usuarioRepository.buscarPorEmail(email);
    }
    public boolean existeUsuario(String email) {
        for (Usuario usuario : usuarioRepository.obtenerUsuarios()) {
            if (usuario.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }
}
