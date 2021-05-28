package eduit.jpa;

import eduit.jpa.dao.PersonaDAO;
import eduit.jpa.entidades.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Clase1Application implements CommandLineRunner{
    
    @Autowired
    PersonaDAO personaDAO;

    public static void main(String[] args) {
	SpringApplication.run(Clase1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        
        Persona persona =new Persona();
        persona.setApellido("Forquera");
        persona.setEdad(35);
        persona.setNombre("Valeria");
        persona.setId(1);
        
        personaDAO.save(persona);
        
        personaDAO.findAll().forEach((p)-> System.out.println(p.getApellido()));
    }

}
