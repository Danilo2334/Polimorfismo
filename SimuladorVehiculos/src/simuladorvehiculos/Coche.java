package simuladorvehiculos;

public class Coche extends Vehiculo {
    private int numeroPuertas;

    public Coche(String matricula, double velocidad, int numeroPuertas) {
        super(matricula, velocidad);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Número de puertas: " + numeroPuertas;
    }
}
