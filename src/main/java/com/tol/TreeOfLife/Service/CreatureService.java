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

    public List<Creature> getBySpecies(String species){
        return creatureRepository.getBySpecies(species);
    }


    //TODO: check to see if the creature does not exist in DB
    public Boolean addCreature(Creature creature){
        creatureRepository.save(creature);
        return true;
    }

    //TODO: safety check to make sure the creature.getID() already exists in the database
    public void updateCreature(Creature creature) {
        creatureRepository.save(creature);
    }

    public void deleteCreature(Long id){
        creatureRepository.delete(id);
    }
}
