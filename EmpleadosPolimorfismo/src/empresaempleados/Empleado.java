package empresaempleados;

public class Empleado {
    protected String nombre;
    protected String dni;
    protected String direccion;
    protected String telefono;
    protected double salario;
    protected int antiguedad;

    public Empleado(String nombre, String dni, String direccion, String telefono, double salario) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.salario = salario;
        this.antiguedad = 0;  
    }

    public void imprimir() {
        System.out.println("Empleado: " + this.nombre + ", DNI: " + this.dni);
        System.out.println("Dirección: " + this.direccion + ", Teléfono: " + this.telefono);
        System.out.println("Antigüedad: " + this.antiguedad + " años");
        System.out.println("Salario: COP $" + String.format("%,.2f", this.salario));
    }

    public void incrementarSalario(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100);
    }
}

