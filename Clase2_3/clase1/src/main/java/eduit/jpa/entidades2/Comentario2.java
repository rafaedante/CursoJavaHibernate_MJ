/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eduit.jpa.entidades2;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author rafaeli
 */
@Entity
public class Comentario2 {
    
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private Integer id;
    private String comentario;
    private String usuario;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Curso2 curso;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Curso2 getCurso() {
        return curso;
    }

    public void setCurso(Curso2 curso) {
        this.curso = curso;
    }
    
    
    
}
