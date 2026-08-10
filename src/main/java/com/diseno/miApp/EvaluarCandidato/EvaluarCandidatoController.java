package com.diseno.miApp.EvaluarCandidato;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/evaluar-candidato")
public class EvaluarCandidatoController {

    private final EvaluarCandidatoService evaluarCandidatoService;

    public EvaluarCandidatoController(EvaluarCandidatoService service) {
        this.evaluarCandidatoService = service;
    }

    @PostMapping("/candidato")
    public BuscarCandidatoEvaluarCandidatoResponse buscarCandidato(
            @RequestBody BuscarCandidatoEvaluarCandidatoRequest request
    ) {

        return evaluarCandidatoService.buscarCandidato(request);
    }
    @PostMapping("/puesto")
    public BuscarPuestoEvaluarCandidatoResponse buscarPuesto(
            @RequestBody BuscarPuestoEvaluarCandidatoRequest request
    ){
        return evaluarCandidatoService.buscarPuesto(request);
    }
    @PostMapping("crearCuestionario")
    public EvaluarCandidatoResponse crearCuestionario(
            @RequestBody EvaluarCandidatoRequest request
    )
    {
        return evaluarCandidatoService.crearCuestionario(request);
    }
}
