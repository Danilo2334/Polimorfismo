package empresaempleados;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Empleado {
    private String coche;
    private String areaVenta;
    private List<String> listaClientes;
    private double porcentajeComisiones;

    public Vendedor(String nombre, String dni, String direccion, String telefono, double salario, String coche, String areaVenta, double porcentajeComisiones) {
        super(nombre, dni, direccion, telefono, salario);
        this.coche = coche;
        this.areaVenta = areaVenta;
        this.listaClientes = new ArrayList<>();
        this.porcentajeComisiones = porcentajeComisiones;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Coche: " + this.coche);
        System.out.println("Área de venta: " + this.areaVenta);
        System.out.println("Clientes: " + listaClientes);
        System.out.println("Salario: COP $" + String.format("%,.2f", this.salario));
        System.out.println("Porcentaje de comisiones: " + this.porcentajeComisiones + "%");
    }

    public void incrementarSalario() {
        incrementarSalario(10);  
        System.out.println("Nuevo salario de Vendedor: COP $" + String.format("%,.2f", this.salario));
    }

    public void darAltaCliente(String cliente) {
        listaClientes.add(cliente);
        System.out.println("Nuevo cliente dado de alta: " + cliente);
    }

    public void darBajaCliente(String cliente) {
        listaClientes.remove(cliente);
        System.out.println("Cliente dado de baja: " + cliente);
    }

    public void cambiarCoche(String nuevoCoche) {
        this.coche = nuevoCoche;
        System.out.println("Coche cambiado a: " + nuevoCoche);
    }
}

