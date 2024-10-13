package simuladorvehiculos;

public class Principal {
    public static void main(String[] args) {
        Coche coche = new Coche("ABC123", 50, 4);
        System.out.println(coche);
        coche.acelerar(30);
        System.out.println("Después de acelerar: " + coche);

        Camion camion = new Camion("XYZ789", 60);
        System.out.println(camion);
    
        Remolque remolque = new Remolque(3000);
        camion.ponRemolque(remolque);
        System.out.println(camion);

        camion.acelerar(50);
        System.out.println("Después de acelerar: " + camion);
    }
}
