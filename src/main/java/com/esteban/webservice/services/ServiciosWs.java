package com.esteban.webservice.services;

import com.esteban.webservice.models.Estudiante;
import com.esteban.webservice.models.Notas;
import jakarta.jws.WebService;

import java.util.List;


@WebService
public interface ServiciosWs {

    Estudiante registrarEstudiante(Estudiante estudiante);

    List<Estudiante>listar();

    Double calcularNota (Notas n);

    Long getIdEstudiante(Long id);

    Long getNota(Long id);
}
