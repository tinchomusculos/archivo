package com.diseno.miApp.Factor;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/factor")
public class FactorController {

    private final FactorService factorService;

    public FactorController(FactorService factorService) {
        this.factorService = factorService;
    }

    @PostMapping("/buscar")
    public BuscarFactorResponse buscarFactor(
            @Valid @RequestBody BuscarFactorRequest request
    ) {
        return factorService.buscarFactor(request);
    }
}