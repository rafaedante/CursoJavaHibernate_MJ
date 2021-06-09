/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eduit.jpa.dao;

import eduit.jpa.entidades.Persona;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Service;

/**
 *
 * @author rafaeli
 */
@Service
public class PersonaDAOImpl {
    
    @PersistenceContext
    private EntityManager em;
    
    public Long cuantasPersonasHay() {
        
        Query query = em.createQuery("SELECT COUNT(p) FROM Persona p");
        Long result = (Long) query.getSingleResult();
        em.close();
        return result;
    }
    
    public List findByName(String nombre) {
        Query query = em.createQuery("SELECT p FROM Persona p JOIN FETCH p.telefonos where p.nombre = :name");
        query.setParameter("name", nombre);
        
        return query.getResultList();
    }
    
    public List findMayorEdad() {
        return em.createNamedQuery("findMayorDeEdad").getResultList();
    }
    
    public List findByApellido(String ap) {
        Query query = em.createNamedQuery("findByApellido");
        query.setParameter("apellido", ap);
        return query.getResultList();
    }
    
    public List getAllApellidosMayuscula() {
        return em.createQuery("SELECT UPPER(p.apellido) FROM Persona p").getResultList();
    }
    
}
