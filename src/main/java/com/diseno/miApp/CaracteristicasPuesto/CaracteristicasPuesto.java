package com.diseno.miApp.CaracteristicasPuesto;

import com.diseno.miApp.Competencia.Competencia;
import com.diseno.miApp.Puesto.Puesto;
import jakarta.persistence.*;

@Entity
public class CaracteristicasPuesto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer ponderacion;
    @ManyToOne
    @JoinColumn(name ="competencia_id")
    private Competencia competencia;
    @ManyToOne
    @JoinColumn(name="puesto_id")
    private Puesto puesto;
}
