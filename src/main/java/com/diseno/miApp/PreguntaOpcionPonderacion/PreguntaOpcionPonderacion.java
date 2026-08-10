package com.diseno.miApp.PreguntaOpcionPonderacion;

import com.diseno.miApp.Pregunta.Pregunta;
import jakarta.persistence.*;

@Entity
public class PreguntaOpcionPonderacion {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer ponderacion;
    @ManyToOne
    @JoinColumn(name ="pregunta_id")
    private Pregunta pregunta;
    


}
