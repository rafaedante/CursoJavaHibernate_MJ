/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eduit.jpa.entidades.herencia3;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author rafaeli
 */
@Repository
public interface Empleado3DAO extends CrudRepository<Empleado3, Integer>{
    
}
