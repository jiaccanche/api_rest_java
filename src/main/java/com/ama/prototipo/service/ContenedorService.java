package com.ama.prototipo.service;

import java.util.LinkedList;
import java.util.List;

import com.ama.prototipo.repository.ContenedorRepository;
import com.ama.prototipo.model.entity.Contenedor;
import com.ama.prototipo.model.request.ContenedorRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContenedorService {
    @Autowired
    private ContenedorRepository contenedorRepository;

    public ContenedorRequest createContenedor(ContenedorRequest contenedorRequest){
        Contenedor conten = new Contenedor();
        return contenedorRequest;
    }

    public List<ContenedorRequest> getTodosContenedores(){
        List<ContenedorRequest> list = new LinkedList<>();
        return list;
    }

    public ContenedorRequest updateContenedor(ContenedorRequest contenedorRequest){
        Contenedor conten =  new Contenedor();
        return contenedorRequest;
    }

    public boolean deleteContendor(ContenedorRequest contenedorRequest){
        Contenedor conten = new Contenedor();
        return true;
    }

}