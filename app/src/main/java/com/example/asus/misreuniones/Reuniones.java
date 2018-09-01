package com.example.asus.misreuniones;

import java.io.Serializable;
import java.util.Date;

public class Reuniones implements Serializable {


    String titulo, lugar, motivo, hora;
    int id;

    public Reuniones() {

    }

    public Reuniones(int id, String titulo, String lugar, String motivo, String hora) {
        this.titulo = titulo;
        this.lugar = lugar;
        this.motivo = motivo;
        this.hora = hora;
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getLugar() {
        return lugar;
    }

    public String getMotivo() {
        return motivo;
    }

    public String getHora() {
        return hora;
    }

    public static Reuniones[] ITEMS = {
            new Reuniones(1,"Juntada el viernes","Casa Esteban","Ver el partido","20 hs"),
            new Reuniones(2,"Exposicion","Casa juan","Repasar los temas","15 hs"),
            new Reuniones(3,"Estudiar","Dpto Paulina","estudiar para el parcial del jueves","14 hs"),

    };

    public static Reuniones getItem(int id) {
        for (Reuniones item : ITEMS) {
            if (item.id == id) {
                return item;
            }
        }
        return null;
    }
}
