package eduit.jpa;


import eduit.jpa.entidades.herencia1.Cliente1;
import eduit.jpa.entidades.herencia1.Empleado1;
import eduit.jpa.entidades.herencia1.Persona1;
import eduit.jpa.entidades.herencia1.Persona1DAO;
import eduit.jpa.entidades.herencia2.Cliente2;
import eduit.jpa.entidades.herencia2.Cliente2DAO;
import eduit.jpa.entidades.herencia2.Empleado2;
import eduit.jpa.entidades.herencia2.Empleado2DAO;
import eduit.jpa.entidades.herencia3.Cliente3;
import eduit.jpa.entidades.herencia3.Cliente3DAO;
import eduit.jpa.entidades.herencia3.Empleado3;
import eduit.jpa.entidades.herencia3.Empleado3DAO;
import eduit.jpa.entidades.herencia4.Cliente4;
import eduit.jpa.entidades.herencia4.Cliente4DAO;
import eduit.jpa.entidades.herencia4.Empleado4;
import eduit.jpa.entidades.herencia4.Empleado4DAO;
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
    Persona1DAO persona1DAO;
    
    @Autowired
    Cliente2DAO cliente2DAO;
    
    @Autowired
    Empleado2DAO empleado2DAO;
    
    @Autowired
    Cliente3DAO cliente3DAO;
    
    @Autowired
    Empleado3DAO empleado3DAO;
    
    @Autowired
    Cliente4DAO cliente4DAO;
    
    @Autowired
    Empleado4DAO empleado4DAO;

    public static void main(String[] args) {
	SpringApplication.run(Clase1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        
//        Persona1 p = new Persona1();
//        p.setApellido("Torres");
//        p.setNombre("Juan");
//        persona1DAO.save(p);
        
//        Cliente1 c = new Cliente1();
//        c.setApellido("Forquera");
//        c.setNombre("Valeria");
//        c.setNumeroCliente(12345L);
//        c.setCantidadCompras(2);
//        persona1DAO.save(c);
//        
//        Empleado1 e = new Empleado1();
//        e.setApellido("Gomez");
//        e.setNombre("Jose");
//        e.setLegajo("Leg1234");
//        e.setSueldo(50000d);
//         persona1DAO.save(e);

//        Cliente2 c = new Cliente2();
//        c.setApellido("Forquera");
//        c.setNombre("Valeria");
//        c.setNumeroCliente(12345L);
//        c.setCantidadCompras(2);
//        cliente2DAO.save(c);
//        
//        Empleado2 e = new Empleado2();
//        e.setApellido("Gomez");
//        e.setNombre("Jose");
//        e.setLegajo("Leg1234");
//        e.setSueldo(50000d);
//        empleado2DAO.save(e);

//        Cliente3 c = new Cliente3();
//        c.setApellido("Flores");
//        c.setNombre("Lorena");
//        c.setNumeroCliente(12346L);
//        c.setCantidadCompras(5);
//        cliente3DAO.save(c);
//        
//        Empleado3 e = new Empleado3();
//        e.setApellido("Riveri");
//        e.setNombre("Dario");
//        e.setLegajo("Leg1224");
//        e.setSueldo(40000d);
//        empleado3DAO.save(e);

        Cliente4 c = new Cliente4();
        c.setApellido("Flores");
        c.setNombre("Lorena");
        c.setNumeroCliente(12346L);
        c.setCantidadCompras(5);
        cliente4DAO.save(c);
        
        Empleado4 e = new Empleado4();
        e.setApellido("Riveri");
        e.setNombre("Dario");
        e.setLegajo("Leg1224");
        e.setSueldo(40000d);
        empleado4DAO.save(e);
    }

}
