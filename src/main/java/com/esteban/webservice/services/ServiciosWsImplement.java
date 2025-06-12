package com.esteban.webservice.services;

import com.esteban.webservice.models.Estudiante;
import com.esteban.webservice.models.Notas;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebService(endpointInterface = "com.esteban.webservice.services.ServiciosWs")

public class ServiciosWsImplement implements  ServiciosWs {

    // Almacenamiento en memoria (simula una base de datos)
    private final List<Estudiante> estudiantes = new ArrayList<>();
    private final List<Notas> notasRegistradas = new ArrayList<>();
    private int contador;

    @Override
    public void registrarEstudiante(Estudiante estudiante) {
        // Asigna un ID autoincremental
        estudiante.setId((long) (estudiantes.size() + 1));
        estudiantes.add(estudiante);
    }

    @Override
    public List<Estudiante> listarEstudiantes() {
        // Retorna una copia para evitar modificaciones externas
        contador++;
        return new ArrayList<>(estudiantes);
    }

    @Override
    public void calcularNota(Notas notas) {
        // Calcula el promedio y estado académico
        notas.calcularPromedio();
        notasRegistradas.add(notas);
    }

    @Override
    public Estudiante buscarEstudiantePorId(Long id) {
        contador++;
        return estudiantes.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Notas obtenerNotasPorEstudiante(Long idEstudiante) {
        return notasRegistradas.stream()
                .filter(n -> n.getIdEstudiante().equals(idEstudiante))
                .findFirst()
                .orElse(null);
    }
}