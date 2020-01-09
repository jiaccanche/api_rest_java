package com.ama.prototipo.rest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UsuarioRest {

    @GetMapping("/details")
    public ResponseEntity<String> getUsuario(){
        return ResponseEntity.ok("Hola mundo");
    } 

}