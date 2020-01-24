package com.ama.prototipo.model.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UsuarioNoEncontrado extends RuntimeException{
    private static final long serialVersionUID = -761503632186596342L;

	public UsuarioNoEncontrado(String e) {
        super(e);
    }
}