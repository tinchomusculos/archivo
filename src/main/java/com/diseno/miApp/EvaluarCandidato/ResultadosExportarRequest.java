package com.diseno.miApp.EvaluarCandidato; 

public class ResultadosExportarRequest {

    private Long idPuesto; 

    public ResultadosExportarRequest() {
    }
    public ResultadosExportarRequest(Long idPuesto) {
        this.idPuesto = idPuesto;
    }
    public Long getIdPuesto() {
        return idPuesto;
    }
    public void setIdPuesto(Long idPuesto) {
        this.idPuesto = idPuesto;
    }
    
}