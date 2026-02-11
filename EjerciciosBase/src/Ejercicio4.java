import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        // Bucles: imprime la tabla de multiplicar de n (1 a 10) con for.

        Scanner consola = new Scanner(System.in);

        System.out.print("Ingrese el número del que deseas conocer sus tablas: ");
        int numero = Integer.parseInt(consola.nextLine());

        for (int i = 1; i <= 10; i++) {
            System.out.println("[" + numero + "]" + " * [" + i + "] = " + numero*i);
        }

    }
}