package com.diseno.miApp.Factor;

import com.diseno.miApp.Competencia.Competencia;
import jakarta.persistence.*;

@Entity
public class Factor {
  @Id
  @GeneratedValue( strategy = GenerationType.IDENTITY)
  private Long id;
  private String codigo;
  private String nombre;
  private String descripcion;
  private Integer nroOrden;
  private boolean estaActvivo;
    @ManyToOne
    @JoinColumn (name="competencia_id")
    private Competencia competencia;
   public Factor(){}
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getNroOrden() {
        return nroOrden;
    }

    public void setNroOrden(Integer nroOrden) {
        this.nroOrden = nroOrden;
    }

    public boolean isEstaActvivo() {
        return estaActvivo;
    }

    public void setEstaActvivo(boolean estaActvivo) {
        this.estaActvivo = estaActvivo;
    }

    public Competencia getCompetencia() {
        return competencia;
    }

    public void setCompetencia(Competencia competencia) {
        this.competencia = competencia;
    }
}
