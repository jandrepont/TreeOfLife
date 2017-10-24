package com.tol.TreeOfLife.Service;


import com.sun.org.apache.regexp.internal.RE;
import com.tol.TreeOfLife.Model.Creature;
import com.tol.TreeOfLife.Repository.CreatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

    public List<Creature> getBySpecies(String species){
        return creatureRepository.getBySpecies(species);
    }

    public Boolean addCreature(Creature creature){
        creatureRepository.save(creature);
        return true;
    }

}
