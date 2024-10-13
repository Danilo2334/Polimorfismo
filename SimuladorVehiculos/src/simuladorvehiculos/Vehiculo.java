package simuladorvehiculos;

public class Vehiculo {
    protected String matricula;
    protected double velocidad;

    public Vehiculo(String matricula, double velocidad) {
        this.matricula = matricula;
        this.velocidad = velocidad;
    }

    public void acelerar(double incremento) {
        velocidad += incremento;
    }

    @Override
    public String toString() {
        return "Matrícula: " + matricula + ", Velocidad: " + velocidad + " km/h";
    }
}
