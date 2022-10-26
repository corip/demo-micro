package com.example.demo2;

public class Persona {
    public String nombre;
    public String apellido;
    public String edad;

    public Persona(){
        this.nombre="Juan";
        this.apellido="Rojas";
        this.edad="38";

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
}
