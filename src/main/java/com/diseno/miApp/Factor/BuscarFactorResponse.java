package com.diseno.miApp.Factor;


import java.util.List;

public class BuscarFactorResponse {

    private List<FactorNombreDescripcion> factores;
    public BuscarFactorResponse() {
    }

    public BuscarFactorResponse(List<FactorNombreDescripcion> factores) {
        this.factores = factores;
    }

    public List<FactorNombreDescripcion> getFactores() {
        return factores;
    }

    public void setFactores(List<FactorNombreDescripcion> factores) {
        this.factores = factores;
    }
}
