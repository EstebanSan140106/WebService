package com.esteban.webservice.models;


import java.io.Serializable;

/**
 * Clase que representa las notas de un estudiante y su estado académico.
 * Implementa Serializable para permitir la transmisión SOAP.
 */
public class Notas implements Serializable {
    private Long idEstudiante;
    private double nota1;  // 22% del promedio
    private double nota2;  // 22% del promedio
    private double nota3;  // 22% del promedio
    private double examen; // 34% del promedio
    private double promedio;
    private String estado; // APROBADO, SUPLETORIO o REPROBADO

    // Constructor vacío necesario para JAX-WS
    public Notas() {}

    // Getters y Setters
    public Long getIdEstudiante() { return idEstudiante; }
    public void setIdEstudiante(Long idEstudiante) { this.idEstudiante = idEstudiante; }
    public double getNota1() { return nota1; }
    public void setNota1(double nota1) { this.nota1 = nota1; }
    public double getNota2() { return nota2; }
    public void setNota2(double nota2) { this.nota2 = nota2; }
    public double getNota3() { return nota3; }
    public void setNota3(double nota3) { this.nota3 = nota3; }
    public double getExamen() { return examen; }
    public void setExamen(double examen) { this.examen = examen; }
    public double getPromedio() { return promedio; }
    public void setPromedio(double promedio) { this.promedio = promedio; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    /**
     * Calcula el promedio ponderado y define el estado académico.
     */
    public void calcularPromedio() {
        this.promedio = (nota1 * 0.22) + (nota2 * 0.22) + (nota3 * 0.22) + (examen * 0.34);

        if (promedio >= 7.0) {
            this.estado = "APROBADO";
        } else if (promedio >= 3.6) {
            this.estado = "SUPLETORIO";
        } else {
            this.estado = "REPROBADO";
        }
    }
}