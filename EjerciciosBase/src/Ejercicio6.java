import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        // Funciones (métodos): implementa isPrime(int n) y úsala para listar primos hasta n

        System.out.print("Ingrese hasta que número desea listar los números primos: ");
        Scanner consola = new Scanner(System.in);
        int limiteNum = Integer.parseInt(consola.nextLine());
        for (int i = 1; i <= limiteNum; i++) {
            if (isPrimo(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isPrimo(int n) {
        if (n <= 1) {
            return false;
        } else {
            for (int j = 2; j < n; j++) {
                if (n % j == 0) {
                    return false;
                }
            }
            return true;
        }
    }

}