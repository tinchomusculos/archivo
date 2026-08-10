package com.diseno.miApp.Candidato;

public class CandidatoImportarResponse {

    private String mensajeExito;
    private int cantidadCreados;       
    private int cantidadActualizados;  
    private int cantidadEliminados;    

    public CandidatoImportarResponse() {
    }

    public CandidatoImportarResponse(String mensajeExito, int cantidadCreados, int cantidadActualizados, int cantidadEliminados) {
        this.mensajeExito = mensajeExito;
        this.cantidadCreados = cantidadCreados;
        this.cantidadActualizados = cantidadActualizados;
        this.cantidadEliminados = cantidadEliminados;
    }

    public String getMensajeExito() {
        return mensajeExito;
    }

    public void setMensajeExito(String mensajeExito) {
        this.mensajeExito = mensajeExito;
    }

    public int getCantidadCreados() {
        return cantidadCreados;
    }

    public void setCantidadCreados(int cantidadCreados) {
        this.cantidadCreados = cantidadCreados;
    }

    public int getCantidadActualizados() {
        return cantidadActualizados;
    }

    public void setCantidadActualizados(int cantidadActualizados) {
        this.cantidadActualizados = cantidadActualizados;
    }

    public int getCantidadEliminados() {
        return cantidadEliminados;
    }

    public void setCantidadEliminados(int cantidadEliminados) {
        this.cantidadEliminados = cantidadEliminados;
    }
}