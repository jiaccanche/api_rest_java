package com.ama.prototipo.model.entity;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import static java.util.stream.Collectors.toList;
@Entity
@Table(name = "USUARIO")
public class Usuario implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_USUARIO")
    private Long id;
    @Column(name = "POINTS")
    private long points = 0;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "APELLIDO_PATERNO")
    private String apellidopaterno;

    @Column(name = "APELLIDO_MATERNO")
    private String apellidomaterno;

    @Column(name = "PASSWORD")
    private String password;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Direccion> direcciones = new LinkedList<Direccion>();

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Telefono> telefonos = new LinkedList<Telefono>();

    @Column(name = "IMAGEN")
    private String img;

    @ElementCollection(fetch = FetchType.EAGER)
    private List<String> roles =  new LinkedList<>();

    public Usuario() {
    }

    public String getImg() {
        return this.img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getPoints() {
        return this.points;
    }

    public void setPoints(long points) {
        this.points = points;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidopaterno() {
        return this.apellidopaterno;
    }

    public void setApellidopaterno(String apellido_paterno) {
        this.apellidopaterno = apellido_paterno;
    }

    public String getApellidomaterno() {
        return this.apellidomaterno;
    }

    public void setApellidomaterno(String apellido_materno) {
        this.apellidomaterno = apellido_materno;
    }

    public List<Direccion> getDirecciones() {
        return this.direcciones;
    }

    public void setDirecciones(List<Direccion> direcciones) {
        this.direcciones = direcciones;
    }

    public List<Telefono> getTelefonos() {
        return this.telefonos;
    }

    public void setTelefonos(List<Telefono> telefonos) {
        this.telefonos = telefonos;
    }

    public void addTelefono(Telefono tel) {
        this.telefonos.add(tel);
    }

    public void addDireccion(Direccion direccion) {
        this.direcciones.add(direccion);
    }

    public void updateTel(String oldTel, String newTel) {
        List<Telefono> teles = this.getTelefonos();
        System.out.println(teles.size());

        for (Telefono tel : teles) {
            boolean compare = tel.getTelefono().equals(oldTel);
            if (compare) {
                tel.setTelefono(newTel);
                break;
            }
        }
    }

    public List<String> getRoles() {
        return this.roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.roles.stream().map(SimpleGrantedAuthority::new).collect(toList());
    }

    @Override
    public String getUsername() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isEnabled() {
        // TODO Auto-generated method stub
        return false;
    }
    

}
