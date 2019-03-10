package com.helloworld.apispring.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ciudadanos")
public class Ciudadano {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_diudadano")
    private int id;

    @Column
    private String nombre_ciudadano;

    @Column
    private int puntos_ciudadano;

    public Ciudadano() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_ciudadano() {
        return nombre_ciudadano;
    }

    public void setNombre_ciudadano(String nombre_ciudadano) {
        this.nombre_ciudadano = nombre_ciudadano;
    }

    public int getPuntos_ciudadano() {
        return puntos_ciudadano;
    }

    public void setPuntos_ciudadano(int puntos_ciudadano) {
        this.puntos_ciudadano = puntos_ciudadano;
    }

}
