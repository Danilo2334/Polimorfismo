package facultadgestion;

public class Profesor extends Persona {
    private String departamento;

    public Profesor(String nombre, String apellido, String identificacion, String estadoCivil, String departamento) {
        super(nombre, apellido, identificacion, estadoCivil);
        this.departamento = departamento;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Profesor: " + nombre + " " + apellido + ", ID: " + identificacion + 
            ", Estado Civil: " + estadoCivil + ", Departamento: " + departamento);
    }
}
