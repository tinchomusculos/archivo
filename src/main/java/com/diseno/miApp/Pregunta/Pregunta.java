package com.diseno.miApp.Pregunta;

import com.diseno.miApp.Factor.Factor;
import com.diseno.miApp.OpcionRespuesta.OpcionRespuesta;
import jakarta.persistence.*;

@Entity
public class Pregunta {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn (name="factor_id")
    private Factor factor;
    private String  name;
    private String textoPregunta;
    private Boolean estaActivo;
    @ManyToOne
    @JoinColumn (name="opcion_respuesta_id")
    private OpcionRespuesta opcionRespuesta;
    public Pregunta (){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Factor getFactor() {
        return factor;
    }

    public void setFactor(Factor factor) {
        this.factor = factor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTextoPregunta() {
        return textoPregunta;
    }

    public void setTextoPregunta(String textoPregunta) {
        this.textoPregunta = textoPregunta;
    }

    public String getEstaActivo() {
        return estaActivo;
    }

    public void setEstaActivo(String estaActivo) {
        this.estaActivo = estaActivo;
    }

    public OpcionRespuesta getOpcionRespuesta() {
        return opcionRespuesta;
    }

    public void setOpcionRespuesta(OpcionRespuesta opcionRespuesta) {
        this.opcionRespuesta = opcionRespuesta;
    }
}
