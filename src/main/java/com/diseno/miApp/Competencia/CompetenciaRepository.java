package com.diseno.miApp.Competencia;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CompetenciaRepository extends JpaRepository<Competencia,Long> {
    Optional<Competencia> findByNombre(String nombre);
}
