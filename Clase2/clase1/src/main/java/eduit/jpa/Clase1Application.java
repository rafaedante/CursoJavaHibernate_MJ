package eduit.jpa;

import eduit.jpa.dao.ComentarioDAO;
import eduit.jpa.dao.CursoDAO;
import eduit.jpa.dao.PersonaDAO;
import eduit.jpa.dao.ProductoDAO;
import eduit.jpa.entidades.Persona;
import eduit.jpa.entidades.Producto;
import eduit.jpa.entidades2.Comentario;
import eduit.jpa.entidades2.Curso;
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
    
    @Autowired
    CursoDAO cursoDAO;
    
    @Autowired
    ComentarioDAO comentarioDAO;

    public static void main(String[] args) {
	SpringApplication.run(Clase1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        
           Curso curso = new Curso();
           curso.setNombre("Java Hibernate");
           curso.setFechaInicio(new Date());
           curso.setDiasCursada("Martes y Jueves de 20 a 22");
           curso.setHorasDuracion(12);
           
           Comentario comentario = new Comentario();
           comentario.setComentario("Buen curso");
           comentario.setUsuario("usuario 1");
           
           Comentario comentario2 = new Comentario();
           comentario2.setComentario("Buen curso x 2");
           comentario2.setUsuario("usuario 2");
           
           Comentario comentario3 = new Comentario();
           comentario3.setComentario("Buen curso x 3");
           comentario3.setUsuario("usuario 3");
           
           List<Comentario> array = curso.getComentarios();
           array.add(comentario);
           array.add(comentario2);
           array.add(comentario3);
           
           curso.setComentarios(array);
           cursoDAO.save(curso);
            
    }

}
