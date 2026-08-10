package com.diseno.miApp.Factor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public interface FactorRepository extends JpaRepository<Factor,Long> {
    List<Factor> findByCompetenciaId(Long id);
    Optional<Factor> findByCompetenciaIdAndNombre(
            Long id,
            String nombreFactor
    );
    Optional<Factor> findByNombre(
            String nombreFactor
    );
}
