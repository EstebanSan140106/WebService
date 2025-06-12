package com.esteban.webservice.services;

import com.esteban.webservice.models.Estudiante;
import com.esteban.webservice.models.Notas;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebService (endpointInterface = "com.esteban.webservice.services.ServiciosWs")

public class ServiciosWsImplement implements  ServiciosWs {
    private final List<Estudiante> estudiantes = new ArrayList<>();
    private final List<Notas> notas = new ArrayList<>();
    private int contador;

    @WebMethod
    @Override
    public Estudiante registrarEstudiante(Estudiante estudiante) {
    estudiante.setId(long) (estudiantes.size()+1));

estudiantes.add(estudiante);
        contador++;
    }

    @WebMethod
    @Override
    public List<Estudiante> listar() {

        contador++;
        return new ArrayList<>(estudiantes);
    }
@WebMethod
    @Override
    public Double calcularNota(Notas n) {
       double promedio = (n.getNota1() * 0.22) + (n.getNota2() * 0.22) + (n.getNota3() * 0.22)+ (n.getExamen()*0.34);

  Notas.setPromedio(promedio);

  if(promedio>= 7) Notas.setEstado("Aprobado");
  else if (promedio>=3.6) notas.setEstado("Supletorio");
  notas.add(n);

}

@WebMethod
    @Override
    public Long getIdEstudiante(Long id) {
    return estudiantes.stream()
            .filter(e-> e.getId()
    }
@WebMethod
    @Override
    public Long getNota(Long id) {
        return 0L;
    }
}
