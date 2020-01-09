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

}