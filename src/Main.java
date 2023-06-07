import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        System.out.println("------- DATOS DE PERSONA -----" );
        Persona persona = new Persona();

        persona.setNombre("Carlos Ramirez");
        persona.setEdad(29);
        persona.setTelefono(643718963);

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Telefono: " + persona.getTelefono());

        System.out.println("------- DATOS DE CLIENTE -----" );

        Cliente cliente = new Cliente();

        cliente.setNombre("Danna Lopez");
        cliente.setEdad(35);
        cliente.setTelefono(643718327);
        cliente.setCredito(3600);

        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Edad: " + cliente.getEdad());
        System.out.println("Telefono: " + cliente.getTelefono());
        System.out.println("El Credito es de: " + cliente.getCredito() + " €");

        System.out.println("------- DATOS DE TRABAJADOR -----" );
         Trabajador trabajador =  new Trabajador();


        trabajador.setNombre("Liliana Romero");
        trabajador.setEdad(31);
        trabajador.setTelefono(643126763);
        trabajador.setSalario(1800);

        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Edad: " + trabajador.getEdad());
        System.out.println("Telefono: " + trabajador.getTelefono());
        System.out.println("El Salario es de: " + trabajador.getSalario() + " €");
    }
}

