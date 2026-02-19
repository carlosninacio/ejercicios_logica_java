import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        // Strings: cuenta vocales, consonantes y espacios; ignora mayúsculas/minúsculas.

        Scanner consola = new Scanner(System.in);
        System.out.print("Introduce la cadena de la que deseas contar su contenido: ");
        String cadena = consola.nextLine();
        System.out.print("\n\nCadena -> " + cadena);
        System.out.println("\n\t- Vocales de la cadena: " + contarVocales(cadena));
    }

    static int contarVocales(String cadena) {
        int contadorVocales = 0;
        cadena = cadena.trim().replace(" ", "");
        char caracter;
        for (int i = 0; i < cadena.length(); i++) {
            caracter = cadena.charAt(i);
            if (String.valueOf(caracter).matches("[aeiouAEIOU]")) {
                contadorVocales++;
            }
        }
        return contadorVocales;
    }
}