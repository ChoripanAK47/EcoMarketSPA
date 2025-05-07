package com.ecomarket.spa.EcoMarketSPA.Pedido.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ecomarket.spa.EcoMarketSPA.Pedido.Model.Pedido;
import com.ecomarket.spa.EcoMarketSPA.Pedido.Service.PedidoService;

@RestController
@RequestMapping("/api/v1/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping
    public List<Pedido> listarPedidos() {
        return pedidoService.getPedidos();
    }

    @PostMapping
    public Pedido agregarPedido(@RequestBody Pedido pedido) {
        return pedidoService.savePedido(pedido);
    }

    @GetMapping("/id/{id}")
    public Pedido buscarPedido(@PathVariable int id) {
        return pedidoService.getPedidoByID(id);
    }

    @PutMapping("{id}")
    public Pedido actualizarPedido(@PathVariable int id, @RequestBody Pedido pedido) {
        return pedidoService.updatePedido(pedido);
    }

    @DeleteMapping("{id}")
    public String eliminarPedido(@PathVariable int id) {
        return pedidoService.deletePedido(id);
    }

    @GetMapping("/total")
    public int totalPedidos() {
        return pedidoService.totalPedidos();
    }
}
