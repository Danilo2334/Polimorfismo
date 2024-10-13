package figuras;

public class Circulo extends FiguraGeometrica {
    private double radio;

    @Override
    public double getArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public void setValor1(int valor1) {
        super.setValor1(valor1);
        this.radio = valor1; // Asignar valor1 al radio del círculo
    }
}
