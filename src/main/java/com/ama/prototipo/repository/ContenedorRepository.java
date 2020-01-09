package com.ama.prototipo.repository;

import com.ama.prototipo.model.entity.Contenedor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContenedorRepository extends JpaRepository<Contenedor, Integer> {

}