package com.diseno.miApp.Candidato;

public class CandidatoImportarRequest {

    private byte[] archivoCsv; 
    private String nombreArchivo;

    public CandidatoImportarRequest() {
    }

    public CandidatoImportarRequest(byte[] archivoCsv, String nombreArchivo) {
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