package facultadgestion;


public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected String identificacion;
    protected String estadoCivil;

    public Persona(String nombre, String apellido, String identificacion, String estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.estadoCivil = estadoCivil;
    }

    public abstract void mostrarInformacion();

    public void cambiarEstadoCivil(String nuevoEstadoCivil) {
        this.estadoCivil = nuevoEstadoCivil;
        System.out.println("El estado civil ha sido cambiado a " + nuevoEstadoCivil);
    }
}
