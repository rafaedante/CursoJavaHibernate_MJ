package eduit.jpa;

import eduit.jpa.dao.ComentarioDAO;
import eduit.jpa.dao.Curso2DAO;
import eduit.jpa.dao.CursoDAO;
import eduit.jpa.dao.PersonaDAO;
import eduit.jpa.dao.PersonaDAOImpl;
import eduit.jpa.dao.ProductoDAO;
import eduit.jpa.dao.ProductoDAOImpl;
import eduit.jpa.dto.PersonaDTO;
import eduit.jpa.entidades.Persona;
import eduit.jpa.entidades.Producto;
import eduit.jpa.entidades.Telefono;
import eduit.jpa.entidades2.Comentario;
import eduit.jpa.entidades2.Comentario2;
import eduit.jpa.entidades2.Curso;
import eduit.jpa.entidades2.Curso2;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Clase1Application_1 implements CommandLineRunner{
    
    @Autowired
    PersonaDAO personaDAO;
    
    @Autowired
    PersonaDAOImpl personaDAOImpl;
    
    @Autowired
    ProductoDAO productoDAO;
    
    @Autowired
    ProductoDAOImpl productoDAOImpl;

    public static void main(String[] args) {
	SpringApplication.run(Clase1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        
//        Long respuestaCantidad = personaDAOImpl.cuantasPersonasHay();
//        System.out.println("Cantidad de personas: " + respuestaCantidad);
//        
//        List<Persona> personasApellido = personaDAOImpl.findByApellido("Ponce");
//        System.out.println("Cantidad de personas x apellido: " + personasApellido.size());
//        
//        List<Persona> personasApellidoMayuscula = personaDAOImpl.getAllApellidosMayuscula();
//        System.out.println("Cantidad de personas mayusucula: " + personasApellidoMayuscula.size());
        
//        Iterable<Persona> personas = personaDAO.findAll();        
//        while(personas.iterator().hasNext()) {
//            Persona p = personas.iterator().next();
//            System.out.println("Nombre persona : " + p.getNombre());
//        }
        
//        personaDAO.findAll().forEach((p)->System.out.println("Nombre persona : " + p.getNombre()));
//        
//        //Double maximoPrecio = productoDAOImpl.findMaxPrecio();
//        System.out.println("Maximo Precio Producto: " + productoDAOImpl.findMaxPrecio());
//        System.out.println("Minimo Precio Producto: " + productoDAOImpl.findMinPrecio());  
//        System.out.println("Promedio Precio Producto: " + productoDAOImpl.findPromedioPrecio());
//        
//        productoDAOImpl.find2Top().forEach((prod) -> System.out.println("Nombre producto : " + prod.getDescripcion()));
//        
//        List<PersonaDTO> lista = personaDAOImpl.getPersonaDTO();
//        for(PersonaDTO personaDTO : lista) {
//            System.out.println(personaDTO.getNombre() + ", " + personaDTO.getNumero());
//        }
//        
//        List<Persona> personasEdad = personaDAOImpl.findByEdad(20);
//        for(Persona persona : personasEdad) {
//            System.out.println(persona.getApellido());
//        }
    }

}
