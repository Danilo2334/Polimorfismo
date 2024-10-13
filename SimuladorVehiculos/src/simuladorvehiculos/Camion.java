package simuladorvehiculos;

public class Camion extends Vehiculo {
    private Remolque remolque;

    public Camion(String matricula, double velocidad) {
        super(matricula, velocidad);
        this.remolque = null; 
    }

    public void ponRemolque(Remolque remolque) {
        this.remolque = remolque;
    }

    public void quitaRemolque() {
        this.remolque = null;
    }

    @Override
    public void acelerar(double incremento) {
        super.acelerar(incremento);
        if (remolque != null && velocidad > 100) {
            System.out.println("¡Demasiado rápido con el remolque!");
        }
    }

    @Override
    public String toString() {
        String infoRemolque = (remolque != null) ? ", " + remolque.toString() : "";
        return super.toString() + infoRemolque;
    }
}
