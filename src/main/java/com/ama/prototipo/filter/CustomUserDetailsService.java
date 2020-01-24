package com.ama.prototipo.filter;

import java.util.LinkedList;
import java.util.List;

import com.ama.prototipo.model.entity.Usuario;
import com.ama.prototipo.repository.UsuarioRepository;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UsuarioRepository  users;
    

    public CustomUserDetailsService(UsuarioRepository users) { 
        this.users = users;
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario user= this.users.findByUsername(username)
            .orElseThrow(() -> new UsernameNotFoundException("Username: " + username + " not found"));
     
            List<GrantedAuthority> authorityList =  this.buildgrante(user.getRoles());   
        
        String username_repo = user.getUsername();    
        String password = user.getPassword();
        boolean activo = user.isActivo();
        User usuarioSecure = new User(username_repo,password,activo,activo,activo,activo,authorityList);    
        return usuarioSecure;
    }

    public List<GrantedAuthority> buildgrante(List<String> lista){
        List<GrantedAuthority> authorityList = new LinkedList<>();
        lista.stream().forEach(role ->{
            authorityList.add(new SimpleGrantedAuthority(role));
        });
        return authorityList;
    }
}