import java.util.Scanner;

public class Ejercicio10 {
        public static void main(String[] args) {

            // Parsing: convierte un String con formato "123,456" a entero (sin usar librerías externas; valida errores).

            Scanner consola = new Scanner(System.in);

            System.out.print("Introduce la cadena que deseas convertir a entero (separa miles con ','): ");
            String numeroCadena = consola.nextLine();

            Integer resultado = parseEnteroConComas(numeroCadena);

            if (resultado == null) {
                System.out.println("Formato inválido");
            } else {
                System.out.println("Entrada: " + numeroCadena);
                System.out.println("Entero: " + resultado);
            }
        }

        static Integer parseEnteroConComas(String s) {
            if (s == null) return null;

            String t = s.trim();

            // Valida: 1-3 dígitos al inicio, luego grupos de ",ddd"
            if (!esFormatoMilesValido(t)) return null;

            // Quita las comas y convierte
            String sinComas = t.replace(",", "");
            try {
                return Integer.parseInt(sinComas);
            } catch (NumberFormatException e) {
                // Por ejemplo, si el número es demasiado grande para int
                return null;
            }
        }

        static boolean esFormatoMilesValido(String t) {
            String regex = "^\\d{1,3}(,\\d{3})*$";
            return t.matches(regex);
        }
    }