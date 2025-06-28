package org.jscen.jscenbus.dao;

import org.jscen.jscenbus.entity.Action;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ActionDao extends JpaRepository<Action, Integer> {

    Optional<Action> findById(Integer id);
    Optional<Action> findByName(String name);

}
