package com.ecomarket.spa.EcoMarketSPA.Usuario.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ecomarket.spa.EcoMarketSPA.Usuario.Model.Usuario;

@Repository
public class UsuarioRepository {
    private List<Usuario> listaUsuarios = new ArrayList<>();
    
    public List<Usuario> obtenerUsuarios() {
        return listaUsuarios;
    }
    public Usuario guardar(Usuario usuario) {
        listaUsuarios.add(usuario);
        return usuario;
    }
    public Usuario buscarPorID(int id) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null;
    }
    public Usuario buscarPorNombre(String nombre) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getNombre().equals(nombre)) {
                return usuario;
            }
        }
        return null;
    }
    public Usuario actualizar(Usuario usuario) {
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (listaUsuarios.get(i).getId() == usuario.getId()) {
                listaUsuarios.set(i, usuario);
                return usuario;
            }
        }
        return null;
    }
    public void eliminar(int id) {
        Usuario usuario = buscarPorID(id);
        if (usuario != null) {
            listaUsuarios.remove(usuario);
        }
    }
    public int totalUsuarios() {
        return listaUsuarios.size();
    }
    public Usuario buscarPorEmail(String email) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getEmail().equals(email)) {
                return usuario;
            }
        }
        return null;
    }
    public Usuario buscarPorTelefono(String telefono) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getTelefono().equals(telefono)) {
                return usuario;
            }
        }
        return null;
    }
    public Usuario buscarPorDireccion(String direccion) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getDireccion().equals(direccion)) {
                return usuario;
            }
        }
        return null;
    }
    public Usuario buscarPorCiudad(String ciudad) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getCiudad().equals(ciudad)) {
                return usuario;
            }
        }
        return null;
    }
    public Usuario buscarPorRegion(String region) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getRegion().equals(region)) {
                return usuario;
            }
        }
        return null;
    }
    public Usuario buscarPorCodigoPostal(String codigoPostal) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getCodigoPostal().equals(codigoPostal)) {
                return usuario;
            }
        }
        return null;
    }
    public Usuario buscarPorApellido(String apellido) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getApellido().equals(apellido)) {
                return usuario;
            }
        }
        return null;
    }
    public Usuario buscarPorNombreYApellido(String nombre, String apellido) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getNombre().equals(nombre) && usuario.getApellido().equals(apellido)) {
                return usuario;
            }
        }
        return null;
    }
    
}
