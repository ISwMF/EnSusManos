package com.helloworld.apispring.controller;

import com.helloworld.apispring.model.dao.CiudadanoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.helloworld.apispring.model.entity.Ciudadano;
import java.util.List;

@Service
public class CiudadanoServicio {

    @Autowired
    private CiudadanoRepositorio ciudadanorepositorio;

    public CiudadanoServicio() {
    }

    public List<Ciudadano> getAllRanking() {
        return ciudadanorepositorio.obtenerTodoslosCiudadanos();
    }

    public String crearRanking(Ciudadano ciudadano) {
        long ciudadanoId = ciudadanorepositorio.crearRanking(ciudadano);
        return "Equipo creado con ID:" + ciudadanoId;
    }
    
}
