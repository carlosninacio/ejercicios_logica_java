import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        // FizzBuzz: del 1 al n, imprime Fizz/Buzz/FizzBuzz según divisibilidad.
        // Fizz divisible por 3, Buzz divisible por 5, FizzBuzz divisible por 3 y 5

        Scanner consola = new Scanner(System.in);

        System.out.print("Ingrese el limite de números que desea evaluar: ");
        int limite = Integer.parseInt(consola.nextLine());

        for (int i = 1; i <= limite; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " - FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println(i + " - Fizz");
            } else if (i % 5 == 0) {
                System.out.println(i + " - Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}