package com.diseno.miApp.Candidato;

import com.diseno.miApp.Nacionalidad.Nacionalidad;
import com.diseno.miApp.genero.Genero;
import jakarta.persistence.*;
import com.diseno.miApp.tipoDocumento.TipoDocumento;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Entity
public class Candidato {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private TipoDocumento tipoDocumento;
    private LocalDate fechaNacimiento;
    private Genero genero;
    private Nacionalidad nacionalidad;
    private String email;
    private String escolaridad;
    private Boolean estaActivo;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
