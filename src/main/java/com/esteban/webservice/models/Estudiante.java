package com.esteban.webservice.models;


import java.io.Serializable;

/**
 * Clase que representa a un estudiante con sus datos personales.
 * Implementa Serializable para permitir la transmisión SOAP.
 */
public class Estudiante implements Serializable {
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String direccion;
    private String telefono;

    // Constructor vacío necesario para JAX-WS
    public Estudiante() {}

    // Constructor con parámetros
    public Estudiante(String nombre, String apellido, String email, String direccion, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
}