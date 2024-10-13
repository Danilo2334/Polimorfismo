package facultadgestion;

public class PersonalDeServicio extends Persona {
    private String seccionAsignada;

    public PersonalDeServicio(String nombre, String apellido, String identificacion, String estadoCivil, String seccionAsignada) {
        super(nombre, apellido, identificacion, estadoCivil);
        this.seccionAsignada = seccionAsignada;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Personal de Servicio: " + nombre + " " + apellido + ", ID: " + identificacion + 
            ", Estado Civil: " + estadoCivil + ", Sección Asignada: " + seccionAsignada);
    }
}
