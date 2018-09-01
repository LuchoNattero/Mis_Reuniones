package com.example.asus.misreuniones;

import java.io.Serializable;
import java.util.List;

public class Grupo implements Serializable {

    String nombre;
    List<Usuario> integrantes;

    public Grupo(String nombre) {
        this.nombre = nombre;
    }

    public Grupo(String nombre, List<Usuario> integrantes) {
        this.nombre = nombre;
        this.integrantes = integrantes;

    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Usuario> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(List<Usuario> integrantes) {
        this.integrantes = integrantes;
    }


}
