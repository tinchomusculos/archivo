package com.diseno.miApp.CuestionarioPregunta;

import com.diseno.miApp.Cuestionario.Cuestionario;
import com.diseno.miApp.Pregunta.Pregunta;
import jakarta.persistence.*;

/*
*  id
  cuestionarioId
  preguntaId
  bloque
  orden*/
@Entity
public class CuestionarioPregunta {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer bloque;
    private Integer orden;
    @ManyToOne
    @JoinColumn(name ="cuestionario_id")
    private Cuestionario cuestionario;
    @ManyToOne
    @JoinColumn(name ="pregunta_id")
    private Pregunta pregunta;

}
