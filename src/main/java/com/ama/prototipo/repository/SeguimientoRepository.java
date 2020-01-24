package com.ama.prototipo.repository;

import java.util.List;
import java.util.Optional;

import com.ama.prototipo.model.entity.Contenedor;
import com.ama.prototipo.model.entity.Seguimiento;
import com.ama.prototipo.model.entity.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeguimientoRepository extends JpaRepository<Seguimiento, Integer> {

    public List<Seguimiento> findByUsuario(Usuario usuario);
    public Optional<Seguimiento> findByUsuarioAndContenedor(Usuario usuario, Contenedor contenedor);

}