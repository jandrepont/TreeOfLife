package com.tol.TreeOfLife.Controller;


import com.tol.TreeOfLife.Model.Creature;
import com.tol.TreeOfLife.Service.CreatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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

}
