package com.esteban.webservice.models;

public class Notas {
    private long idEstudiante;
    private double nota1;
    private double nota2;
    private double nota3;
    private double examen;
    private double promedio;
    private String estado;

public Notas() {

}
    public long getIdEstudiante() {
    return idEstudiante;
    }

    public void setIdEstudiante(long idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getExamen() {
        return examen;
    }

    public void setExamen(double examen) {
        this.examen = examen;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {

        this.promedio=promedio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}

