package Ejercicio12;

public class Triangulo extends Forma {

    private final double altura;
    private final double base;

    public Triangulo (double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double calcularArea() {
        return (altura * base) / 2;
    }
}
