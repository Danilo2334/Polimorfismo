package empresaempleados;

public class Principal {
    public static void main(String[] args) {
        // Crear un secretario
        Secretario secretario = new Secretario("Carlos", "987654321X", "Calle Secundaria 456", "555-1234", 2500000, "Despacho 201", "555-9876");
        
        // Crear un jefe de zona
        JefeZona jefeZona = new JefeZona("Laura García", "876345198D", "Calle Central 123", "555-6789", 7000000, "Despacho 101", "Audi", secretario);
        
        // Crear vendedores
        Vendedor vendedor1 = new Vendedor("Ana", "123456789A", "Calle 1", "555-1111", 3000000, "Ford Focus", "Área Norte", 5);
        Vendedor vendedor2 = new Vendedor("Luis", "234567890B", "Calle 2", "555-2222", 3000000, "Chevrolet Aveo", "Área Sur", 5);
        
        // Imprimir datos
        jefeZona.imprimir();
        
        // Incrementar salario de jefe de zona
        jefeZona.incrementarSalario();
        
        // Dar de alta vendedores
        jefeZona.darAltaVendedor(vendedor1);
        jefeZona.darAltaVendedor(vendedor2);
        
        // Dar de baja un vendedor
        jefeZona.darBajaVendedor(vendedor1);
        
        // Cambiar el coche del jefe de zona
        jefeZona.cambiarCoche("BMW X5");
        
        // Cambiar secretario
        Secretario nuevoSecretario = new Secretario("María", "543219876T", "Calle Nueva 789", "555-3333", 2500000, "Despacho 202", "555-6543");
        jefeZona.cambiarSecretario(nuevoSecretario);
    }
}

