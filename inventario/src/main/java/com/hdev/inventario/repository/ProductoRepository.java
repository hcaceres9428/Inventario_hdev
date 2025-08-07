package com.hdev.inventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hdev.inventario.model.Producto;

import jakarta.persistence.Entity;

@Entity
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    
}
