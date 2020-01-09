package com.ama.prototipo.model.exception;

import org.springframework.http.HttpStatus;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
public class InvalidJwtAuthenticationException extends AuthenticationException{
    private static final long serialVersionUID = -761503632186596342L;

	public InvalidJwtAuthenticationException(String e) {
        super(e);
    }
}