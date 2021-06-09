/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eduit.jpa.entidades2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author rafaeli
 */
@Entity
public class Curso2 {
    
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private Integer id;
    private String nombre;
    private Date fechaInicio;
    private Integer horasDuracion;
    private String diasCursada;
    
    @OneToMany(mappedBy = "curso", cascade = CascadeType.ALL, orphanRemoval = true)    
    private List<Comentario2> comentarios = new ArrayList<>();
    
    public void agregarComentario(Comentario2 comentario) {
        comentarios.add(comentario);
        comentario.setCurso(this);
    }
    
    public void removeComment(Comentario2 comentario) {
        comentarios.remove(comentario);
        comentario.setCurso(null);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Integer getHorasDuracion() {
        return horasDuracion;
    }

    public void setHorasDuracion(Integer horasDuracion) {
        this.horasDuracion = horasDuracion;
    }

    public String getDiasCursada() {
        return diasCursada;
    }

    public void setDiasCursada(String diasCursada) {
        this.diasCursada = diasCursada;
    }

    public List<Comentario2> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario2> comentarios) {
        this.comentarios = comentarios;
    }
    
}
