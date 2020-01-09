package com.ama.prototipo.repository;

import com.ama.prototipo.model.entity.Seguimiento;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeguimientoRepository extends JpaRepository<Seguimiento, Integer> {

}