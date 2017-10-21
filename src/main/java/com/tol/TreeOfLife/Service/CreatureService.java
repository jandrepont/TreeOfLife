package com.tol.TreeOfLife.Service;


import com.tol.TreeOfLife.Model.Creature;
import com.tol.TreeOfLife.Repository.CreatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CreatureService {

    @Autowired
    private CreatureRepository creatureRepository;

    public List<Creature> getAllCreatures(){
        ArrayList<Creature> creatures = new ArrayList<>();
        creatureRepository.findAll().forEach(creatures::add);
        return creatures;
    }
}
