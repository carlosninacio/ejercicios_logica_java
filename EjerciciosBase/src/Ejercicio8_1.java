import java.util.Scanner;

public class Ejercicio8_1 {
    public static void main(String[] args) {

        // Crear 2 matrices y acceder a valores de la primera matriz

        Scanner consola = new Scanner(System.in);
        System.out.print("Introduzca el número de filas de la primera matriz: ");
        int filas = Integer.parseInt(consola.nextLine());
        System.out.print("Introduzca el número de columnas de la primera matriz: ");
        int columnas = Integer.parseInt(consola.nextLine());
        int[][] matriz = new int[filas][columnas];

        // Rellenar matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j ++) {
                System.out.print("Introduce un número para la posición [" + i + "] [" + j + "] -> ");
                matriz[i][j] = Integer.parseInt(consola.nextLine());
            }
        }

        // Recorrer matriz
        for (int i = 0; i < filas; i++) {
            System.out.println();
            for (int j = 0; j < columnas; j ++) {
                System.out.print(" [" + matriz[i][j] + "]");
            }
        }

        System.out.print("Introduzca el número de filas de la segunda matriz: ");
        filas = Integer.parseInt(consola.nextLine());
        System.out.print("Introduzca el número de columnas de la segunda matriz: ");
        columnas = Integer.parseInt(consola.nextLine());
        int[][] matriz2 = new int[filas][columnas];

        // Rellenar matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j ++) {
                System.out.print("Introduce un número para la posición [" + i + "] [" + j + "] -> ");
                matriz2[i][j] = Integer.parseInt(consola.nextLine());
            }
        }

        // Recorrer matriz
        for (int i = 0; i < filas; i++) {
            System.out.println();
            for (int j = 0; j < columnas; j ++) {
                System.out.print(" [" + matriz2[i][j] + "]");
            }
        }


        System.out.println(matriz.length);
        System.out.println(matriz[0].length);


    }
}