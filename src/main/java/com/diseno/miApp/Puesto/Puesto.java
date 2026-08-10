package com.diseno.miApp.Puesto;

import com.diseno.miApp.Empresa.Empresa;
import jakarta.persistence.*;

@Entity
public class Puesto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigo;
    private String nombre;
    private String descripcion;
    private Boolean estaActiva;
    @ManyToOne
    @JoinColumn(name ="empresa_id")
    private Empresa empresa;
}
