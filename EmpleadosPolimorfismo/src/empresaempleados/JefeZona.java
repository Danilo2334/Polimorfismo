package empresaempleados;

import java.util.ArrayList;
import java.util.List;

public class JefeZona extends Empleado {
    private String despacho;
    private String coche;
    private Secretario secretario;
    private List<Vendedor> listaVendedores;

    public JefeZona(String nombre, String dni, String direccion, String telefono, double salario, String despacho, String coche, Secretario secretario) {
        super(nombre, dni, direccion, telefono, salario);
        this.despacho = despacho;
        this.coche = coche;
        this.secretario = secretario;
        this.listaVendedores = new ArrayList<>();
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Despacho: " + this.despacho);
        System.out.println("Coche: " + this.coche);
        System.out.println("Secretario: " + this.secretario.nombre);
        System.out.println("Número de vendedores a su cargo: " + listaVendedores.size());
        System.out.println("Salario: COP $" + String.format("%,.2f", this.salario));
    }

    public void incrementarSalario() {
        incrementarSalario(20);  
        System.out.println("Nuevo salario de Jefe de Zona: COP $" + String.format("%,.2f", this.salario));
    }

    public void cambiarSecretario(Secretario nuevoSecretario) {
        this.secretario = nuevoSecretario;
        System.out.println("Nuevo secretario asignado: " + nuevoSecretario.nombre);
    }

    public void cambiarCoche(String nuevoCoche) {
        this.coche = nuevoCoche;
        System.out.println("Coche cambiado a: " + nuevoCoche);
    }

    public void darAltaVendedor(Vendedor vendedor) {
        listaVendedores.add(vendedor);
        System.out.println("Nuevo vendedor dado de alta: " + vendedor.nombre);
    }

    public void darBajaVendedor(Vendedor vendedor) {
        listaVendedores.remove(vendedor);
        System.out.println("Vendedor dado de baja: " + vendedor.nombre);
    }
}
