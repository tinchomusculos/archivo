package com.diseno.miApp.Factor;

import com.diseno.miApp.Competencia.Competencia;
import com.diseno.miApp.Competencia.CompetenciaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FactorService {
    private final FactorRepository factorRepository;
    private final CompetenciaRepository competenciaRepository;
    public FactorService(FactorRepository factorRepository, CompetenciaRepository competenciaRepository){

        this.factorRepository=factorRepository;
        this.competenciaRepository=competenciaRepository;
    }
    public BuscarFactorResponse buscarFactor(BuscarFactorRequest request) {

        ArrayList<FactorNombreDescripcion> factores = new ArrayList<>();

        String nombreCompetencia = request.getNombreCompetencia();
        String nombreFactor = request.getNombreFactor();

        boolean tieneCompetencia =
                nombreCompetencia != null && !nombreCompetencia.isBlank();

        boolean tieneFactor =
                nombreFactor != null && !nombreFactor.isBlank();

        // Validar que al menos uno venga informado
        if (!tieneCompetencia && !tieneFactor) {
            throw new RuntimeException(
                    "Debe informar nombreCompetencia o nombreFactor"
            );
        }

        // Buscar por competencia y factor
        if (tieneCompetencia && tieneFactor) {

            Competencia competenciaBuscada = competenciaRepository
                    .findByNombre(nombreCompetencia)
                    .orElse(null);

            if (competenciaBuscada == null) {
                return new BuscarFactorResponse(factores);
            }

            Factor factorBuscado = factorRepository
                    .findByCompetenciaIdAndNombre(
                            competenciaBuscada.getId(),
                            nombreFactor
                    )
                    .orElse(null);

            if (factorBuscado != null) {

                factores.add(
                        new FactorNombreDescripcion(
                                factorBuscado.getNombre(),
                                factorBuscado.getDescripcion()
                        )
                );
            }
        }

        // Buscar solo por competencia
        else if (tieneCompetencia) {

            Competencia competenciaBuscada = competenciaRepository
                    .findByNombre(nombreCompetencia)
                    .orElse(null);

            if (competenciaBuscada == null) {
                return new BuscarFactorResponse(factores);
            }

            List<Factor> factoresBuscados = factorRepository
                    .findByCompetenciaId(competenciaBuscada.getId());

            for (Factor factor : factoresBuscados) {

                factores.add(
                        new FactorNombreDescripcion(
                                factor.getNombre(),
                                factor.getDescripcion()
                        )
                );
            }
        }

        // Buscar solo por factor
        else if (tieneFactor) {

            Factor factorBuscado = factorRepository
                    .findByNombre(nombreFactor)
                    .orElse(null);

            if (factorBuscado != null) {
                factores.add(
                        new FactorNombreDescripcion(
                                factorBuscado.getNombre(),
                                factorBuscado.getDescripcion()
                        )
                );
            }
        }

        return new BuscarFactorResponse(factores);
    }


}
