/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eduit.jpa.dao;

import eduit.jpa.entidades.Producto;
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
public class ProductoDAOImpl {
    
    @PersistenceContext
    private EntityManager em;
    
    public Double findMaxPrecio() {    
        Query query = em.createQuery("SELECT Max(p.precio) FROM Producto p");
        Double result = (Double) query.getSingleResult();
        em.close();
        return result;        
    }
    
    public Double findMinPrecio() {    
        Query query = em.createQuery("SELECT Min(p.precio) FROM Producto p");
        Double result = (Double) query.getSingleResult();
        em.close();
        return result;        
    }
    
    public Double findPromedioPrecio() {    
        Query query = em.createQuery("SELECT Avg(p.precio) FROM Producto p");
        Double result = (Double) query.getSingleResult();
        em.close();
        return result;        
    }
    
    public List<Producto> find2Top() {
        Query query = em.createQuery("FROM Producto p order by p.precio desc");
        query.setMaxResults(2);
        List<Producto> result =  query.getResultList();
        em.close();
        return result;
    }
    
}
