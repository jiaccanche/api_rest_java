package com.ama.prototipo.service;

import java.time.LocalDateTime;

import com.ama.prototipo.model.entity.DirectorioUsuarioProyecto;
import com.ama.prototipo.model.entity.Proyecto;
import com.ama.prototipo.model.entity.Usuario;
import com.ama.prototipo.repository.DirectorioUsuarioProyectoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@RequestMapping("registros")
public class DirectorioUsuarioProyectoService{

    @Autowired
    private DirectorioUsuarioProyectoRepository directorioUsuarioProyectoRepository;

    public void createRegistros(Usuario user, Proyecto pro){
        DirectorioUsuarioProyecto directorio =  new DirectorioUsuarioProyecto();
        //pro2
        directorio.setProyecto(pro);
        //user2
        directorio.setUsuario(user);
        
        directorio.setTime(LocalDateTime.now());

        DirectorioUsuarioProyecto directorio2 =  new DirectorioUsuarioProyecto();
        
        directorio2.setProyecto(pro);
        Usuario user1 = new Usuario(); user1.setId(new Long(1));
        directorio2.setUsuario(user1);
        
        directorio2.setTime(LocalDateTime.now());
        directorio.setTime(LocalDateTime.now());

        directorioUsuarioProyectoRepository.save(directorio2);
        directorioUsuarioProyectoRepository.save(directorio);

        Proyecto pro2 = new Proyecto(); pro2.setId(new Long(1));
        //Tupla 3
        DirectorioUsuarioProyecto directorio3 = new DirectorioUsuarioProyecto();
        directorio3.setUsuario(user);
        directorio3.setProyecto(pro2);
        //Tupla 4
        DirectorioUsuarioProyecto directorio4 = new DirectorioUsuarioProyecto();
        directorio4.setUsuario(user1);
        directorio4.setProyecto(pro2);

        directorioUsuarioProyectoRepository.save(directorio3);
        directorioUsuarioProyectoRepository.save(directorio4);

    }
}