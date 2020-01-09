package com.ama.prototipo.model.request;

import javax.validation.constraints.NotNull;

public class UsuarioRequest{
    @NotNull(message = "El nombre no puede estar vacío.")
    private String nombre;
    @NotNull(message = "El apellido materno no puede estar vacío.")
    private String apellido_materno;
    @NotNull(message = "El apellido paterno no puede estar vacío.")
    private String apellido_paterno;
    

}