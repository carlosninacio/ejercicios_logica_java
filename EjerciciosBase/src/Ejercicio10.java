import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        // Parsing: convierte un String con formato "123,456" a entero (sin usar librerías externas; valida errores).

        Scanner consola = new Scanner(System.in);
        System.out.print("Introduce la cadena que deseas convertir a entero (Recuerda separar miles con ','): ");
        String numeroCadena = consola.nextLine();
        System.out.println(convertirEntero(numeroCadena));
    }

    static int convertirEntero(String numeroCadena) {
        int retorno = 0;
        for (int i = 0; i < numeroCadena.length(); i++) {
            if (numeroCadena.charAt(i) == ',') {
                int contadorMiles = 0;
                for (int j = 0; j <= 3; j++) {
                    if (String.valueOf(numeroCadena.charAt(i)).matches("[0-9]")) {
                        contadorMiles++;
                    }
                }
                if (contadorMiles < 3) {
                    System.out.println("Formato Invalido");
                    break;
                }
            }
        }
        return retorno;
    }
}