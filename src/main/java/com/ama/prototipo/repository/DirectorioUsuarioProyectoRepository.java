package com.ama.prototipo.repository;

import com.ama.prototipo.model.entity.DirectorioUsuarioProyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectorioUsuarioProyectoRepository extends JpaRepository<DirectorioUsuarioProyecto, Integer>
{
    
}