package com.ecomarket.spa.EcoMarketSPA.Usuario.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecomarket.spa.EcoMarketSPA.Usuario.Model.Usuario;
import com.ecomarket.spa.EcoMarketSPA.Usuario.Service.UsuarioService;

@RestController
@RequestMapping("/api/v1/usuarios")
public class UsuarioController {
    // Aquí puedes agregar los métodos para manejar las operaciones CRUD de los usuarios
    // Por ejemplo, puedes agregar métodos para crear, leer, actualizar y eliminar usuarios.
    // Asegúrate de inyectar el servicio correspondiente para interactuar con la base de datos.
    @Autowired
    private UsuarioService usuarioService;
    
    @GetMapping
    public List<Usuario> listarUsuarios() {
        return usuarioService.getUsuarios();
    }

    @PostMapping
    public Usuario agregarUsuario(Usuario usuario) {
        return usuarioService.saveUsuario(usuario);
    }

    @GetMapping("/id/{id}")
    public Usuario buscarUsuario(int id) {
        return usuarioService.getUsuarioID(id);
    }

    @GetMapping("/nombre/{nombre}")
    public Usuario buscarUsuario(String nombre) {
        return usuarioService.getUsuario(nombre);
    }

    @GetMapping("/email/{email}")
    public Usuario buscarUsuarioEmail(String email) {
        return usuarioService.getUsuarioEmail(email);
    }

    @GetMapping("/total")
    public int totalUsuarios() {
        return usuarioService.totalUsuarios();
    }
    

}
