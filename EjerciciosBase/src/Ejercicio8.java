import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        // Matrices, verificar si matriz es identidad

        Scanner consola = new Scanner(System.in);
        System.out.print("Introduzca el número de filas y columnas que desea para su matriz cuadrada: ");
        int longitud = Integer.parseInt(consola.nextLine());
        int[][] matriz = new int[longitud][longitud];

        // Prueba: Rellenar matriz
        for (int i = 0; i < longitud; i++) {
            for (int j = 0; j < longitud; j ++) {
                System.out.print("Introduce un número para la posición [" + i + "] [" + j + "] -> ");
                matriz[i][j] = Integer.parseInt(consola.nextLine());
            }
        }

        // Prueba: Recorrer matriz
        for (int i = 0; i < longitud; i++) {
            System.out.println();
            for (int j = 0; j < longitud; j ++) {
                System.out.print(" [" + matriz[i][j] + "]");
            }
        }

        // Comprobar si es identidad
        boolean esIdentidad = true;
        for (int i = 0; i < longitud; i++) {
            for (int j = 0; j < longitud; j ++) {
                if (i == j) {
                    if (matriz[i][j] != 1) {
                        esIdentidad = false;
                        break;
                    }
                } else {
                    if (matriz[i][j] != 0) {
                        esIdentidad = false;
                        break;
                    }
                }
            }
            if (!esIdentidad) {
                break;
            }
        }

        System.out.println("");
        String mensaje = (esIdentidad) ? "\nLa matriz es identidad" : "\nLa matriz NO es identidad";
        System.out.println(mensaje);

    }
}