package com.hdev.inventario.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdev.inventario.model.Producto;
import com.hdev.inventario.repository.ProductoRepository;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> obteneTodos() {
        return productoRepository.findAll();
    }

    public Optional<Producto> obtenerPorId(Long id){

        return  productoRepository.findById(id);
    }    

    public Producto guardar(Producto producto){
        return productoRepository.save(producto);
    }

    public void eliminar(Long id){
        productoRepository.deleteById(id);
    }
}
