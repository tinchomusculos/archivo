package com.diseno.miApp.Cuestionario;

import com.diseno.miApp.Candidato.Candidato;
import com.diseno.miApp.EstadoCuestionario.EstadoCuestionario;

import com.diseno.miApp.Puesto.Puesto;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
/*

 */
public class Cuestionario {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private EstadoCuestionario estadoCuestionario;
    private String claveIngreso;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaRealizacion;
    private LocalDateTime fechaLimiteActivo;
    private LocalDateTime fechaLimiteFinalizacion;
    private LocalDateTime ultimoIngreso;
    private Integer cantidadAccesos;
    private LocalDateTime fechaCambioEstado;
    @ManyToOne
    @JoinColumn(name="candidato_id")
    private Candidato candidato;
    @ManyToOne
    @JoinColumn(name="puesto_id")
    private Puesto puesto;



}
