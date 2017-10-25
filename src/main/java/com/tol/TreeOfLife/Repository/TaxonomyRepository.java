package com.tol.TreeOfLife.Repository;


import com.tol.TreeOfLife.Model.Taxonomy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaxonomyRepository extends JpaRepository<Taxonomy, String> {

    @Query(value = "select * from taxonomy where genus_species=:genus_species", nativeQuery = true)
    List<Taxonomy> getBySpecies(@Param("genus_species") String genus_species);
}
