package com.diseno.miApp.EvaluarCandidato;

public class ResultadosExportarResponse {
   
    private byte[] archivoCsv; 
    private String nombreArchivo;

    public ResultadosExportarResponse() {
    }

    public ResultadosExportarResponse(byte[] archivoCsv, String nombreArchivo) {
        this.archivoCsv = archivoCsv;
        this.nombreArchivo = nombreArchivo;
    }

    public byte[] getArchivoCsv() {
        return archivoCsv;
    }

    public void setArchivoCsv(byte[] archivoCsv) {
        this.archivoCsv = archivoCsv;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }
}