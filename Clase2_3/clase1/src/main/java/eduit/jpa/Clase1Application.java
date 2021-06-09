package eduit.jpa;

import eduit.jpa.dao.ComentarioDAO;
import eduit.jpa.dao.Curso2DAO;
import eduit.jpa.dao.CursoDAO;
import eduit.jpa.dao.PersonaDAO;
import eduit.jpa.dao.ProductoDAO;
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
public class Clase1Application implements CommandLineRunner{
    
//    @Autowired
//    CursoDAO cursoDAO;
//    
//    @Autowired
//    ComentarioDAO comentarioDAO;
//    
//    @Autowired
//    Curso2DAO curso2DAO;
    
    @Autowired
    PersonaDAO personaDAO;

    public static void main(String[] args) {
	SpringApplication.run(Clase1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        
//           Curso curso = new Curso();
//           curso.setNombre("Java Hibernate");
//           curso.setFechaInicio(new Date());
//           curso.setDiasCursada("Martes y Jueves de 20 a 22");
//           curso.setHorasDuracion(12);
//           
//           Comentario comentario = new Comentario();
//           comentario.setComentario("Buen curso");
//           comentario.setUsuario("usuario 1");
//           
//           Comentario comentario2 = new Comentario();
//           comentario2.setComentario("Buen curso x 2");
//           comentario2.setUsuario("usuario 2");
//           
//           Comentario comentario3 = new Comentario();
//           comentario3.setComentario("Buen curso x 3");
//           comentario3.setUsuario("usuario 3");
//           
//           List<Comentario> array = curso.getComentarios();
//           array.add(comentario);
//           array.add(comentario2);
//           array.add(comentario3);
//           
//           curso.setComentarios(array);
//           cursoDAO.save(curso);

            // PARTE 2

//            Curso2 curso = new Curso2();
//            curso.setNombre("Java Hibernate");
//            curso.setFechaInicio(new Date());
//            curso.setDiasCursada("Martes y Jueves de 20 a 22");
//            curso.setHorasDuracion(12);
//            
//            Comentario2 comentario = new Comentario2();
//            comentario.setComentario("Buen curso");
//            comentario.setUsuario("usuario 1");
//           
//            Comentario2 comentario2 = new Comentario2();
//            comentario2.setComentario("Buen curso x 2");
//            comentario2.setUsuario("usuario 2");
//           
//            Comentario2 comentario3 = new Comentario2();
//            comentario3.setComentario("Buen curso x 3");
//            comentario3.setUsuario("usuario 3");
//            
//            List<Comentario2> array = curso.getComentarios();
//            array.add(comentario);
//            array.add(comentario2);
//            array.add(comentario3);
//            
//            curso.setComentarios(array);
//            curso2DAO.save(curso);

              //   PARTE 3
              Persona persona = new Persona();
              persona.setApellido("Lorenzo");
              persona.setNombre("Claudio");
              persona.setEdad(30);
              
              Telefono telefono1 = new Telefono();
              telefono1.setTipo("celular");
              telefono1.setNumero(1143567890);
              
              Telefono telefono2 = new Telefono();
              telefono2.setTipo("celular2");
              telefono2.setNumero(1143567675);
              
              Telefono telefono3 = new Telefono();
              telefono3.setTipo("celular3");
              telefono3.setNumero(1143561234);
              
              List<Telefono> array = persona.getTelefonos();
              array.add(telefono1);
              array.add(telefono2);
              array.add(telefono3);
              
              persona.setTelefonos(array);
              personaDAO.save(persona);

               
    }

}
