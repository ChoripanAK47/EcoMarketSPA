package com.ecomarket.spa.EcoMarketSPA.Pedido.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ecomarket.spa.EcoMarketSPA.Pedido.Model.Pedido;

@Repository
public class PedidoRepository {
    private List<Pedido> listaPedidos = new ArrayList<>();

    public PedidoRepository() {
        listaPedidos.add(new Pedido(1, "Pedro Kongche", "Quillota 569", "Credito", 25000, "Enviado", "02-05-2025", "07-05-2025"));
        listaPedidos.add(new Pedido(2, "Juanito Perez", "Santiago 123", "Debito", 15000, "Enviado", "02-05-2025", "07-05-2025"));
        listaPedidos.add(new Pedido(3, "Maria Gonzalez", "Valparaiso 456", "Efectivo", 30000, "Enviado", "02-05-2025", "07-05-2025"));
        listaPedidos.add(new Pedido(4, "Josefina Gonzalez", "Valparaiso 456", "Efectivo", 35000, "Enviado", "02-05-2025", "07-05-2025"));
        listaPedidos.add(new Pedido(5, "Kendrick Lamar", "La Calera 133", "Credito", 50000, "Enviado", "28-04-2025", "04-05-2025"));
    }

    public List<Pedido> obtenerlistaPedidos() {
        return listaPedidos;
    }
    public Pedido guardar(Pedido pedido) {
        listaPedidos.add(pedido);
        return pedido;
    }
    public Pedido buscarPorID(int id) {
        for (Pedido pedido : listaPedidos) {
            if (pedido.getId() == id) {
                return pedido;
            }
        }
        return null;
    }
    public Pedido actualizar(Pedido pedido) {
        for (int i = 0; i < listaPedidos.size(); i++) {
            if (listaPedidos.get(i).getId() == pedido.getId()) {
                listaPedidos.set(i, pedido);
                return pedido;
            }
        }
        return null;
    }
    public void eliminar(int id) {
        Pedido pedido = buscarPorID(id);
        if (pedido != null) {
            listaPedidos.remove(pedido);
        }
    }
    public int totallistaPedidos() {
        return listaPedidos.size();
    }
}
