package com.diseno.miApp.RespuestaCuestionario;

import com.diseno.miApp.Cuestionario.Cuestionario;
import com.diseno.miApp.DetalleOpcionRespuesta.DetalleOpcionRespuesta;
import com.diseno.miApp.Pregunta.Pregunta;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class RespuestaCuestionario {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name= "cuestionario_id")
    private Cuestionario cuestionario;
    @ManyToOne
    @JoinColumn(name= "pregunta_id")
    private Pregunta pregunta;
    @ManyToOne
    @JoinColumn(name= "detalle_opcion_respuesta_id")
    private DetalleOpcionRespuesta detalleOpcionRespuesta;
    private LocalDate fechaRespuesta;


}
