package facultadgestion;

public class Principal {
    public static void main(String[] args) {

    	
        Estudiante estudiante1 = new Estudiante("Erik", "Pérez", "97824", "Soltero", "Matemáticas");
        Profesor profesor1 = new Profesor("Libia", "Ordoñez", "65713", "Casado", "Lenguajes");
        PersonalDeServicio personal1 = new PersonalDeServicio("Camilo", "Cabreras", "45731", "Divorciado", "Biblioteca");

     
        estudiante1.mostrarInformacion();
        profesor1.mostrarInformacion();
        personal1.mostrarInformacion();
        profesor1.cambiarEstadoCivil("Soltero");
        profesor1.mostrarInformacion();
    }
}
