/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helloworld.apispring.model.dao;

import com.helloworld.apispring.model.entity.RankingFifa;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class RankingRepositorio {

    @Autowired
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<RankingFifa> getAllEquipos() {
        Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(RankingFifa.class);
        return criteria.list();
    }

    public long crearRanking(RankingFifa rankingFifa) {
        getSessionFactory().getCurrentSession().save(rankingFifa);
        return rankingFifa.getRankId();
    }
}
