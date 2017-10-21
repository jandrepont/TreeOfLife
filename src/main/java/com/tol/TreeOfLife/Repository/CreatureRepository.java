package com.tol.TreeOfLife.Repository;

import com.tol.TreeOfLife.Model.Creature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreatureRepository extends JpaRepository<Creature, Long> {}
