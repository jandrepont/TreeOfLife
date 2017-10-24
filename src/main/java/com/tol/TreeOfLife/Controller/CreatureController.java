package com.tol.TreeOfLife.Controller;


import com.tol.TreeOfLife.Model.Creature;
import com.tol.TreeOfLife.Repository.CreatureRepository;
import com.tol.TreeOfLife.Service.CreatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static sun.misc.Version.println;


@RestController
@RequestMapping("/creatures")
public class CreatureController {

    @Autowired
    private CreatureService creatureService;

    @Autowired
    private CreatureRepository creatureRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Creature>  getAllCreatures(){

        return creatureService.getAllCreatures();
    }

    @RequestMapping(value = "/{species}", method = RequestMethod.GET)
    public List<Creature> getSpecies(@PathVariable("species") String species){
        return creatureService.getBySpecies(species);
    }


    @RequestMapping(method = RequestMethod.POST, value = "/post")
    public String addCreature(@RequestBody Creature creature) throws Exception{

        try{
            creatureService.addCreature(creature);
        } catch(Exception e){
            throw new Exception(e.getCause().getCause().getMessage());
        }

        return String.valueOf(creature);
    }

}
