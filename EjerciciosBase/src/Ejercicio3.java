import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        // Condicionales: dado un número, determina si es positivo/negativo/cero y si es par/impar.

        Scanner consola = new Scanner(System.in);
        String valorNumerico = "";
        String tipoNumero = "";

        System.out.print("Ingrese el número a evaluar: ");
        int numero = consola.nextInt();

        if (numero < 0) {
            valorNumerico = "es negativo";
        } else if (numero > 0) {
            valorNumerico = "es positivo";
        } else {
            valorNumerico = "es cero";
        }

        if (numero % 2 == 0) {
            tipoNumero = "es par";
        } else {
            tipoNumero = "es impar";
        }

        System.out.println("El número: " + numero + " " + valorNumerico + " y " + tipoNumero);

        // Versión Compacta con operador ternario

        valorNumerico = (numero < 0) ? "es negativo" : (numero > 0) ? "es positivo": "es cero";
        tipoNumero = (numero % 2 == 0) ? "es par" : "es impar";

        System.out.println("El número: " + numero + " " + valorNumerico + " y " + tipoNumero);
    }
}