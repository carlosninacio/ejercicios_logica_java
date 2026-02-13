import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        // Arreglos: dado un arreglo, calcula min, max, suma y promedio.

        Scanner consola = new Scanner(System.in);

        System.out.print("Ingrese de qué tamaño desea el arreglo: ");
        int largo = Integer.parseInt(consola.nextLine());
        int[] arreglo = new int[largo];

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingrese el número para el indice [" + i + "]: ");
            int numero = Integer.parseInt(consola.nextLine());
            arreglo[i] = numero;
        }

        System.out.println(numeroMin(arreglo));
        System.out.println(numeroMax(arreglo));
        System.out.println(sumaArreglo(arreglo));
        System.out.println(promedioArreglo(arreglo));

    }

    public static int numeroMin(int[] arreglo) {
        int numeroMenor = 999999999;
        for (int i = 0; i < arreglo.length; i++) {
            if (numeroMenor > arreglo[i]) {
                numeroMenor = arreglo[i];
            }
        }
        return numeroMenor;
    }

    public static int numeroMax(int[] arreglo) {
        int numeroMayor = -1;
        for (int i = 0; i < arreglo.length; i++) {
            if (numeroMayor < arreglo[i]) {
                numeroMayor = arreglo[i];
            }
        }
        return numeroMayor;
    }

    public static int sumaArreglo(int[] arreglo) {
        int resultado = 0;
        for (int i = 0; i < arreglo.length; i++) {
            resultado += arreglo[i];
        }
        return resultado;
    }

    public static double promedioArreglo(int[] arreglo) {
        int resultado = 0;
        for (int i = 0; i < arreglo.length; i++) {
            resultado += arreglo[i];
        }
        return resultado / (double) arreglo.length;
    }
}