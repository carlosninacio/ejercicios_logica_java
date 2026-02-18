import java.util.Scanner;

public class Ejercicio8_2 {
    public static void main(String[] args) {

        // Matrices: sumar matrices n x m y verificar si son identidad (solo si es cuadrada)

        Scanner consola = new Scanner(System.in);
        System.out.print("Introduzca el número de filas de la primera matriz: ");
        int filas = Integer.parseInt(consola.nextLine());
        System.out.print("Introduzca el número de columnas de la primera matriz: ");
        int columnas = Integer.parseInt(consola.nextLine());
        int[][] matriz1 = crearMatriz(consola, filas, columnas);

        System.out.print("\nIntroduzca el número de filas de la segunda matriz: ");
        filas = Integer.parseInt(consola.nextLine());
        System.out.print("Introduzca el número de columnas de la segunda matriz: ");
        columnas = Integer.parseInt(consola.nextLine());
        int[][] matriz2 = crearMatriz(consola, filas, columnas);

        System.out.println("\nMatriz 1");
        imprimirMatriz(matriz1);
        
        System.out.println("\n\nMatriz 2");
        imprimirMatriz(matriz2);
        System.out.println("\n\nResultado suma de matrices");
        int[][] resultado = sumarMatrices(matriz1,matriz2);
        imprimirMatriz(resultado);

    }

    static int[][] crearMatriz(Scanner consola, int filas, int columnas) {
        int[][] m = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            System.out.println();
            for (int j = 0; j < columnas; j ++) {
                System.out.print("Introduce un número para la posición [" + i + "] [" + j + "] -> ");
                m[i][j] = Integer.parseInt(consola.nextLine());
            }
        }
        return m;
    }

    static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.println();
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(" [" + matriz[i][j] + "]");
            }
        }
    }

    static int[][] sumarMatrices(int[][] m1, int[][] m2) {
        int[][] resultado = new int[m1.length][m1[0].length];
        for (int i = 0; i < m1.length; i++) {
            System.out.println();
            for (int j = 0; j < m1[i].length; j++) {
                resultado[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return resultado;
    }
}