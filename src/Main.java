
public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();

        persona.setNombre("Carlos Ramirez");
        persona.setEdad(29);
        persona.setTelefono(643718963);

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Telefono: " + persona.getTelefono());
    }
}