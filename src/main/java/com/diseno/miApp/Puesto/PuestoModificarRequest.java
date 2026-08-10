package com.diseno.miApp.Puesto;

import com.diseno.miApp.Empresa.Empresa;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class PuestoModificarRequest {
    private String codigo;
    private String nombre;
    private String nombreEmpresa;
}
