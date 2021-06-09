/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eduit.jpa.dao;

import eduit.jpa.entidades.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author rafaeli
 */
@Repository
public interface PersonaDAO extends CrudRepository<Persona, Integer>{
    
}
