package com.ama.prototipo.rest;

import com.ama.prototipo.model.entity.Message;
import com.ama.prototipo.model.request.UsuarioRequest;
import com.ama.prototipo.service.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UsuarioRest  {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/details/{num_usuario}")
    public ResponseEntity<UsuarioRequest> getUser(@RequestParam int num_usuario){
        UsuarioRequest new_user =  usuarioService.getUsuario(num_usuario);
        return ResponseEntity.ok(new_user);
    } 

    @PostMapping("/create")
    public ResponseEntity<Message> createUser(@RequestBody UsuarioRequest usuario){
        Message msg = new Message();
        msg.setMessage("El usuario ha sido creado");
        msg.setTime("HH:mm:ss YYYY/MM/DD");
        return ResponseEntity.ok(msg); 
    }

}