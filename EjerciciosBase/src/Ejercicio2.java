import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        // Variables y casting: lee dos enteros, calcula promedio como double (evita división entera).

        Scanner consola = new Scanner(System.in);
        System.out.print("Ingrese el primer entero: ");
        int entero1 = Integer.parseInt(consola.nextLine());
        System.out.print("Ingrese el segundo entero: ");
        int entero2 = Integer.parseInt(consola.nextLine());


        // Se debe forzar a que un operando sea double para evitar la división entera
        double promedio = ((double) entero1 + entero2) / 2;
        System.out.println("El promedio es: " + promedio);
    }
}