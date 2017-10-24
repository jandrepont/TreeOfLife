package com.tol.TreeOfLife.Repository;

import com.tol.TreeOfLife.Model.Creature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CreatureRepository extends JpaRepository<Creature, Long> {

    @Query(value = "select * from creature where species=:species", nativeQuery = true)
    List<Creature> getBySpecies(@Param("species") String species);
}
