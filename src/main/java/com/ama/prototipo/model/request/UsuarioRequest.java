package com.ama.prototipo.model.request;

import javax.validation.constraints.NotNull;

public class UsuarioRequest{
    @NotNull(message = "El nombre no puede estar vacío.")
    private String nombre;
    @NotNull(message = "El apellido materno no puede estar vacío.")
    private String apellido_materno;
    @NotNull(message = "El apellido paterno no puede estar vacío.")
    private String apellido_paterno;
    @NotNull(message = "Los puntos no debe ser nulo.")
    private Long puntos;
    @NotNull(message = "El nombre de la imagen no debe ser vacío.")
    private String img;
    @NotNull(message = "El correo no debe ser vacío.")
    private String email;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_materno() {
        return this.apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public String getApellido_paterno() {
        return this.apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public Long getPuntos() {
        return this.puntos;
    }

    public void setPuntos(Long puntos) {
        this.puntos = puntos;
    }

    public String getImg() {
        return this.img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    

}