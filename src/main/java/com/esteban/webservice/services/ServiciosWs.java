package com.esteban.webservice.services;

import com.esteban.webservice.models.Estudiante;
import com.esteban.webservice.models.Notas;
import jakarta.jws.WebService;
import jakarta.jws.WebMethod;

import java.util.List;


@WebService
public interface ServiciosWs {


    /**
     * Registra un nuevo estudiante en el sistema.
     * @param estudiante Objeto Estudiante con los datos personales
     */
    @WebMethod
    void registrarEstudiante(Estudiante estudiante);

    /**
     * Obtiene la lista completa de estudiantes registrados.
     * @return Lista de objetos Estudiante
     */
    @WebMethod
    List<Estudiante> listarEstudiantes();

    /**
     * Calcula el promedio y estado académico de un estudiante.
     * @param notas Objeto Notas con las calificaciones
     */
    @WebMethod
    void calcularNota(Notas notas);

    /**
     * Busca un estudiante por su ID.
     * @param id Identificador del estudiante
     * @return Objeto Estudiante o null si no se encuentra
     */
    @WebMethod
    Estudiante buscarEstudiantePorId(Long id);

    /**
     * Obtiene las notas de un estudiante específico.
     * @param idEstudiante Identificador del estudiante
     * @return Objeto Notas o null si no se encuentra
     */
    @WebMethod
    Notas obtenerNotasPorEstudiante(Long idEstudiante);
}