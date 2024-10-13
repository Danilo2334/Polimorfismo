package empresaempleados;

public class Secretario extends Empleado {
    private String despacho;
    private String numeroFax;

    public Secretario(String nombre, String dni, String direccion, String telefono, double salario, String despacho, String numeroFax) {
        super(nombre, dni, direccion, telefono, salario);
        this.despacho = despacho;
        this.numeroFax = numeroFax;
    }

    @Override
    public void imprimir() {
        super.imprimir(); 
        System.out.println("Despacho: " + this.despacho);
        System.out.println("Número de Fax: " + this.numeroFax);
        System.out.println("Salario: COP $" + String.format("%,.2f", this.salario)); // Mostrar salario en COP
    }

    public void incrementarSalario() {
        incrementarSalario(5); 
        System.out.println("Nuevo salario de Secretario: COP $" + String.format("%,.2f", this.salario));
    }
}
