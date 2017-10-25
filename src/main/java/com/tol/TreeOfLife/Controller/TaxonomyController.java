package com.tol.TreeOfLife.Controller;


import com.tol.TreeOfLife.Model.Taxonomy;
import com.tol.TreeOfLife.Service.TaxonomyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/taxonomy")
public class TaxonomyController {

    @Autowired
    TaxonomyService taxonomyService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Taxonomy>  getAllCreatures(){

        return taxonomyService.getAllTaxonomies();
    }

    @RequestMapping(value = "/{genus_species}", method = RequestMethod.GET)
    public List<Taxonomy> getBySpecies(String genus_species){

        return taxonomyService.getBySpecies(genus_species);
    }


}
