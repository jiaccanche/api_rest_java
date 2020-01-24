package com.ama.prototipo.repository;

import java.util.Optional;

import com.ama.prototipo.model.entity.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findByEmailAndPassword(String email, String password);
    Optional<Usuario> findByEmail(String email);
    Optional<Usuario> findByUsername(String unsername);

}