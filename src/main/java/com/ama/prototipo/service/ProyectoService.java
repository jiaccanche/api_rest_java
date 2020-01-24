package com.ama.prototipo.service;

import com.ama.prototipo.model.entity.Proyecto;
import com.ama.prototipo.repository.ProyectoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService{

    @Autowired
    private ProyectoRepository proyectoRepository;

    //Test
    public Proyecto createProyecto(){
        Proyecto pro =  new Proyecto();
        pro.setImg("image.png");
        pro.setName("Proyecto_prueba");

        Proyecto pro2 =  new Proyecto();
        pro.setImg("image.png");
        pro.setName("Proyecto_prueba_2");

        proyectoRepository.save(pro);
        return proyectoRepository.save(pro2);

    }
}