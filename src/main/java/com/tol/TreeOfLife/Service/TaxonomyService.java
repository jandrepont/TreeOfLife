package com.tol.TreeOfLife.Service;


import com.tol.TreeOfLife.Model.Taxonomy;
import com.tol.TreeOfLife.Repository.TaxonomyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaxonomyService {

    @Autowired
    TaxonomyRepository taxonomyRepository;

    public List<Taxonomy> getAllTaxonomies(){
        ArrayList<Taxonomy> taxonomies = new ArrayList<>();
        taxonomyRepository.findAll().forEach(taxonomies::add);
        return taxonomies;
    }

    public List<Taxonomy> getBySpecies(String genus_species){
        return taxonomyRepository.getBySpecies(genus_species);
    }
}
