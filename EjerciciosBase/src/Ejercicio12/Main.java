package Ejercicio12;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Forma> formas = new ArrayList<>();
        Triangulo triangulo = new Triangulo(12.5,38);
        Circulo circulo = new Circulo(2);
        Circulo circulo2 = new Circulo(1.5);
        formas.add(triangulo);
        formas.add(circulo);
        formas.add(circulo2);

        double total = 0;
        for (Forma f: formas) {
            total += f.calcularArea();
        }

        System.out.println("Total: " + total);
    }

}