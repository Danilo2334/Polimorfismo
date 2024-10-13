package facultadgestion;


public class Estudiante extends Persona {
    private String cursoMatriculado;

    public Estudiante(String nombre, String apellido, String identificacion, String estadoCivil, String cursoMatriculado) {
        super(nombre, apellido, identificacion, estadoCivil);
        this.cursoMatriculado = cursoMatriculado;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Estudiante: " + nombre + " " + apellido + ", ID: " + identificacion + 
            ", Estado Civil: " + estadoCivil + ", Curso Matriculado: " + cursoMatriculado);
    }
}
