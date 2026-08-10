package com.diseno.miApp.autenticador;

import com.diseno.miApp.Cuestionario.CuestionarioRepository;
import com.diseno.miApp.JWT.JwtService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AutenticarService {
    private final CuestionarioRepository cuestionarioRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    public AutenticarService(CuestionarioRepository cuestionarioRepository, PasswordEncoder passwordEncoder,JwtService jwtService){
        this.jwtService=jwtService;
        this.cuestionarioRepository=cuestionarioRepository;
        this.passwordEncoder=passwordEncoder;

    }

    public AutenticarResponse autenticarCandidato(AutenticarCandidatoRequest request)
    {
    return null;
    }

    public AutenticarResponse autenticarConsultor(AutenticarConsultorRequest request) {
    return null;}
}
