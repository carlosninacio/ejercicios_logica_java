import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        // Arreglos 2D: suma de matrices n×m y verificación de matriz identidad (si es cuadrada).
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
            for (int j = 0; j < longitud; j ++) {
                System.out.println(matriz[i][j]);
            }
        }

    }
}