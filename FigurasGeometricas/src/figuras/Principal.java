package figuras;

public class Principal {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.setValor1(5);
        System.out.println("Área del círculo: " + circulo.getArea());
        System.out.println("Perímetro del círculo: " + circulo.getPerimetro());

        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setValor1(4);
        System.out.println("Área del cuadrado: " + cuadrado.getArea());
        System.out.println("Perímetro del cuadrado: " + cuadrado.getPerimetro());

        Rectangulo rectangulo = new Rectangulo();
        rectangulo.setValor1(4);
        rectangulo.setValor2(6);
        System.out.println("Área del rectángulo: " + rectangulo.getArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.getPerimetro());

        Triangulo triangulo = new Triangulo();
        triangulo.setValor1(3);
        triangulo.setValor2(5);
        System.out.println("Área del triángulo: " + triangulo.getArea());
        System.out.println("Perímetro del triángulo: " + triangulo.getPerimetro());

        Cubo cubo = new Cubo();
        cubo.setValor1(3);
        System.out.println("Área del cubo: " + cubo.getArea());
    }
}
