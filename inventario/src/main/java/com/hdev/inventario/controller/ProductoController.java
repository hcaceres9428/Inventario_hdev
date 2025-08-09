package com.hdev.inventario.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdev.inventario.model.Producto;
import com.hdev.inventario.service.ProductoService;

@RestController
@RequestMapping
@CrossOrigin(origins = "*")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping
    public List<Producto> listaProductos() {
        return productoService.obteneTodos();
    }

    @GetMapping("/{id}")
    public Optional<Producto> obtenerProducto(@PathVariable Long id) {
        return productoService.obtenerPorId(id);
    }
    
    @PostMapping
    public Producto creaProducto(@RequestBody Producto producto){
        return productoService.guardar(producto);
    }

    @PutMapping("/{id}")
    public Producto actualizaProducto(@PathVariable Long id, @RequestBody Producto producto){
        producto.setId(id);
        return productoService.guardar(producto);
    }

    @DeleteMapping("/{id}")
    public void eliminarProducto(@PathVariable Long id){
        productoService.eliminar(id);
    }
}
