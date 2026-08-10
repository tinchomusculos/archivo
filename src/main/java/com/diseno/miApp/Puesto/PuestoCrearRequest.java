package com.diseno.miApp.Puesto;

import com.diseno.miApp.CaracteristicasPuesto.CaracteristicasPuesto;
import com.diseno.miApp.Empresa.Empresa;

import java.util.List;

public class PuestoCrearRequest {
    private String codigo;
    private String nombre;
    private String descripcion;
    private Empresa empresa;
    private List<CaracteristicasPuesto> caracteristicasPuesto;
}
