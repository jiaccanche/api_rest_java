package com.ama.prototipo.model.entity;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CONTENEDOR")
public class Contenedor{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CONTENEDOR")
    private long id;
    @Column(name = "DETALLE")
    private String detalle;
    @Column(name = "NUMERO_BL")
    private String BL;
    @OneToMany(mappedBy="contenedor", cascade = CascadeType.ALL)
    private List<Documento> documentos = new LinkedList<>();

    public Contenedor(){}
    
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDetalle() {
        return this.detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getBL() {
        return this.BL;
    }

    public void setBL(String BL) {
        this.BL = BL;
    }

    public List<Documento> getDocumentos() {
        return this.documentos;
    }

    public void setDocumentos(List<Documento> documentos) {
        this.documentos = documentos;
    }



}