/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eduit.jpa.dao;

import eduit.jpa.entidades.Persona;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author rafaeli
 */
@Repository
public interface PersonaDAO extends CrudRepository<Persona, Integer>{
    
    @Query("FROM Persona p WHERE p.nombre = :personaNombre")
    public Iterable<Persona> findByName(@Param("personaNombre") String name);
    
    @Override
    List<Persona> findAll();
    
}
