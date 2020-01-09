package com.ama.prototipo.service;

import com.ama.prototipo.model.entity.Seguimiento;
import com.ama.prototipo.model.request.SeguimientoRequest;
import com.ama.prototipo.repository.SeguimientoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeguimientoService {
    @Autowired
    private SeguimientoRepository seguimientoRepository;

    public SeguimientoRequest createSeguimiento(SeguimientoRequest seguimientoRequest){
       Seguimiento segui =  new Seguimiento(); 
       return seguimientoRequest;
    }

    public SeguimientoRequest getSeguimiento(SeguimientoRequest seguimientoRequest){
        Seguimiento segui = new Seguimiento();
        return seguimientoRequest;  
    }

    public SeguimientoRequest updateSeguimiento(SeguimientoRequest seguimientoRequest){
        Seguimiento segui = new Seguimiento();
        return seguimientoRequest;
    }

    public boolean deleteSeguimiento(SeguimientoRequest seguimientoRequest){
        Seguimiento segui = new Seguimiento();
        return true;
    }


}