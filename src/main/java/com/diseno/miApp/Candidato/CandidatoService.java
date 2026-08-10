package com.diseno.miApp.Candidato;

import org.springframework.stereotype.Service;

@Service
public class CandidatoService {
    private final CandidatoRepository candidatoRepository;

    CandidatoService (CandidatoRepository candidatoRepository){
        this.candidatoRepository=candidatoRepository;
    }
    public Candidato crearCandidato (){
        return null;
    }
}
