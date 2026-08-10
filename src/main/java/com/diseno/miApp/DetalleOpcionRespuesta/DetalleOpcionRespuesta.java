package com.diseno.miApp.DetalleOpcionRespuesta;

import com.diseno.miApp.OpcionRespuesta.OpcionRespuesta;
import jakarta.persistence.*;

@Entity
public class DetalleOpcionRespuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descripcion;
    private Integer ordenVisualizacion;
    @ManyToOne
    @JoinColumn(name ="opcion_respuesta_id")
    private OpcionRespuesta opcionRespuesta;

}
