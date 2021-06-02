package eduit.jpa;

import eduit.jpa.dao.PersonaDAO;
import eduit.jpa.dao.ProductoDAO;
import eduit.jpa.entidades.Persona;
import eduit.jpa.entidades.Producto;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Clase1Application implements CommandLineRunner{
    
    @Autowired
    PersonaDAO personaDAO;
    
    @Autowired
    ProductoDAO productoDAO;

    public static void main(String[] args) {
	SpringApplication.run(Clase1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        
//        Persona persona =new Persona();
//        persona.setApellido("Ponce");
//        persona.setEdad(32);
//        persona.setNombre("Daniel");
//        //persona.setId(4);
//        
//        personaDAO.save(persona);
//        
//        personaDAO.findAll().forEach((p)-> System.out.println(p.getApellido()));

          Producto producto = new Producto();
          producto.setDescripcion("Producto 3");
          producto.setFechaAlta(new Date());
          producto.setPrecio(50.5);
          producto.setId(7);
          
          productoDAO.save(producto);         
          
          productoDAO.findAll().forEach((p)-> System.out.println(p.getDescripcion()));

            
    }

}
