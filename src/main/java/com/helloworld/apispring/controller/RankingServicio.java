/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helloworld.apispring.controller;

import com.helloworld.apispring.model.dao.RankingRepositorio;
import com.helloworld.apispring.model.entity.RankingFifa;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RankingServicio {
    
    @Autowired
    private RankingRepositorio rankingRepositorio;

    public RankingServicio() {
    }
    
    public List<RankingFifa> getAllRanking(){
        return rankingRepositorio.getAllEquipos();
    }

   public String crearRanking(RankingFifa rankingFifa) {
    long equipoId= rankingRepositorio.crearRanking(rankingFifa);
    return "Equipo creado con ID:"+equipoId;
    }
}
