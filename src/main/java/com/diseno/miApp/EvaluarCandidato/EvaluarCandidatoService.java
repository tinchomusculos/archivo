package com.diseno.miApp.EvaluarCandidato;

import com.diseno.miApp.Puesto.Puesto;
import com.diseno.miApp.Puesto.PuestoRepository;
import org.springframework.stereotype.Service;

@Service
public class EvaluarCandidatoService {
    private PuestoRepository puestoRepository;
    public EvaluarCandidatoService(PuestoRepository puestoRepository){
        this.puestoRepository=puestoRepository;
    }
    public  EvaluarCandidatoResponse crearCuestionario(EvaluarCandidatoRequest request) {
        return null;
    }

    public BuscarCandidatoEvaluarCandidatoResponse buscarCandidato(
            BuscarCandidatoEvaluarCandidatoRequest request) {
     return null;
    }

    public BuscarPuestoEvaluarCandidatoResponse buscarPuesto(BuscarPuestoEvaluarCandidatoRequest request) {
// validar reglas de negocio
        Puesto puesto= puestoRepository.findById(5L).orElse(null);
        return null;
    }
}
