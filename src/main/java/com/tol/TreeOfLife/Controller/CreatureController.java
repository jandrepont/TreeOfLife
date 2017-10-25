package com.tol.TreeOfLife.Controller;


import com.tol.TreeOfLife.Model.Creature;
import com.tol.TreeOfLife.Service.CreatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/creatures")
public class CreatureController {

    @Autowired
    private CreatureService creatureService;

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

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public void updateCreature(@RequestBody Creature creature) throws Exception{
        try {
            creatureService.updateCreature(creature);
        } catch(Exception e){
            throw new Exception(e.getCause().getCause().getMessage());
        }

    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteCreature(@PathVariable("id") Long id){
        creatureService.deleteCreature(id);
    }


}
