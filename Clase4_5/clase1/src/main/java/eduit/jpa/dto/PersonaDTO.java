/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eduit.jpa.dto;

/**
 *
 * @author rafaeli
 */
public class PersonaDTO {
    
     private String nombre;
     private int numero;

    public PersonaDTO() {
    }

    public PersonaDTO(String nombre, int id) {
        this.nombre = nombre;
        this.numero = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
     
     
    
}
