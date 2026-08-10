package com.diseno.miApp.Puesto;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Puesto")
public class PuestoController {
    private final PuestoService puestoService;
    PuestoController (PuestoService puestoService){
        this.puestoService=puestoService;
    }
    @PostMapping("/modificar")
    public Puesto modicarPuesto(){
        return  null;
    }
}
