package com.ama.prototipo.repository;

import java.util.List;

import com.ama.prototipo.model.entity.Contenedor;
import com.ama.prototipo.model.entity.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContenedorRepository extends JpaRepository<Contenedor, Integer> {
    public List<Contenedor> findByUsuario(Usuario usuario);

}