package com.ama.prototipo.service;

import java.util.LinkedList;
import java.util.List;
import com.ama.prototipo.model.entity.Telefono;
import com.ama.prototipo.model.entity.Usuario;
import com.ama.prototipo.model.exception.UsuarioNoEncontrado;
import com.ama.prototipo.model.request.UsuarioRequest;
import com.ama.prototipo.repository.UsuarioRepository;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;


@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuariorepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    
    public Usuario testUsuario(){
        
        Usuario usuario =  new Usuario();
        usuario.setEmail("jorge1234@gmail.com");
        usuario.setUsername("JIACC");
        usuario.setPassword(this.passwordEncoder.encode("12345"));
        //usuario.setPassword("12345");
        LinkedList<String> list = new LinkedList<>();
        list.add("ROLE_USER");
        usuario.setRoles(list);
        this.usuariorepository.save(usuario);

        Usuario usuario2 =  new Usuario();
        usuario2.setEmail("jorge1@gmail.com");
        usuario2.setPassword(this.passwordEncoder.encode("12345"));
        //usuario2.setPassword("12345");
        usuario2.setUsername("JICC");
        LinkedList<String> list2 = new LinkedList<>();
        list2.add("ROLE_ADMIN");
        usuario2.setRoles(list2);
        return this.usuariorepository.save(usuario2);        
    
    }

    //Test
    public void CreateUsuario(){
        Usuario user = new Usuario();
        user.setNombre("Jorge Ignacio Abel");
        user.setEmail("jcanchecauich@gmail.com");
        user.setApellidomaterno("Cauich");
        user.setApellidopaterno("Canche");
        user.setPoints(100);

        Telefono tel = new Telefono();
        tel.setTelefono("9991151968");
        tel.setUsuario(user);
        user.addTelefono(tel);

        this.usuariorepository.save(user);
    }

    /*public List<Usuario> getUsuariosPorProyecto(int proyecto){
        
    }*/

    //test
    public UsuarioRequest getUsuario(int num_usuario){
        Usuario usuario = this.usuariorepository.findById(num_usuario).orElseThrow(
          () -> new UsuarioNoEncontrado("El usuario con número:" + num_usuario + "No fue encontrado.") 
        );
        
        UsuarioRequest usuarioRespuesta = new UsuarioRequest();
        usuarioRespuesta.setNombre(usuario.getNombre());
        usuarioRespuesta.setApellido_materno(usuario.getApellidomaterno());
        usuarioRespuesta.setApellido_paterno(usuario.getApellidopaterno());
        usuarioRespuesta.setPuntos(usuario.getPoints());
        usuarioRespuesta.setImg(usuario.getImg());
        usuarioRespuesta.setEmail(usuario.getEmail());
        return usuarioRespuesta;
        
    }
    //test
    public Usuario updateUsuario(){
        Usuario user = this.usuariorepository.findById(1).get();
        List<Telefono> telefonos = user.getTelefonos();
        int a = telefonos.size();
        user.updateTel("9991151961","99911519680");

        return this.usuariorepository.save(user);

    }


    public UsuarioRequest createUsuario(UsuarioRequest userRequest){
        Usuario user =  new Usuario();
        return userRequest;
    }

    public UsuarioRequest readUsuario(UsuarioRequest userRequest){
        Usuario user =  new Usuario();
        return userRequest;
    }

    public UsuarioRequest updateUsuario(UsuarioRequest userRequest){
       Usuario user = new Usuario();
       return userRequest; 
    }

    public boolean deleteUsuario(UsuarioRequest usuarioRequest){
        Usuario user = new Usuario();
        return true;
    }


}