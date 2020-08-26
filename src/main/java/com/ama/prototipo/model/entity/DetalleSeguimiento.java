package com.ama.prototipo.model.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DETALLE_SEGUIMIENTO")
public class DetalleSeguimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_DS")
    private long id; 
    @Column(name = "ORDEN")
    private long orden;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "ICONO")
    private String icono;
    @Column(name = "FECHAHORA")
    private LocalDateTime fechahora_actual;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SEGUIMIENTO_ID")
    private Seguimiento seguimiento;


    public DetalleSeguimiento(){}

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getOrden() {
        return this.orden;
    }

    public void setOrden(long orden) {
        this.orden = orden;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getIcono() {
        return this.icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }

    public LocalDateTime getFechahora_actual() {
        return this.fechahora_actual;
    }

    public void setFechahora_actual(LocalDateTime fechahora_actual) {
        this.fechahora_actual = fechahora_actual;
    }

    public Seguimiento getSeguimiento() {
        return this.seguimiento;
    }

    public void setSeguimiento(Seguimiento seguimiento) {
        this.seguimiento = seguimiento;
    }

}