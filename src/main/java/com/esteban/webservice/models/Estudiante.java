package com.esteban.webservice.models;

public class Estudiante {

    private long id;
    private String nombre;
    private String apellido;
    private String email;
    private String direccion;
    private int telefono;

    public Estudiante() {

    }

    public Estudiante(long id, String nombre, String apellido, String email, String direccion, int telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
    }


    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
