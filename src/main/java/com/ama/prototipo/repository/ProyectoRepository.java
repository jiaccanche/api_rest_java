package com.ama.prototipo.repository;

import com.ama.prototipo.model.entity.Proyecto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepository extends JpaRepository<Proyecto, Integer>
{
    
}