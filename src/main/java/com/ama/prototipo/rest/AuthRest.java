package com.ama.prototipo.rest;
import com.ama.prototipo.filter.JwtTokenProvider;
import com.ama.prototipo.model.request.AuthenticationRequest;
import com.ama.prototipo.model.request.JWTResponseRequest;
import com.ama.prototipo.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthRest{
    @Autowired
    JwtTokenProvider jwtTokenProvider;

    @Autowired
    UsuarioRepository users;
    
    @Autowired
    AuthenticationManager authenticationManager;
    

    @PostMapping("/signin")
    public ResponseEntity<JWTResponseRequest> signin(@RequestBody AuthenticationRequest data) {        
        try {
            String username = data.getusername();
            
            authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(username, data.getPassword())
                );
            
            String token = createToken(username);
            JWTResponseRequest res = new JWTResponseRequest();
            res.setToken(token);
            res.setUsername(username);
            return ResponseEntity.ok(res);
            
        } catch (AuthenticationException e) {
            throw new BadCredentialsException("Invalid username/password supplied");
        }
    }

    public String createToken(String username){

    return  jwtTokenProvider.createToken(
                username, 
                this.users.findByUsername(username).orElseThrow(
                () -> new UsernameNotFoundException("Username " + username + "not found")).getRoles());            
    }
}