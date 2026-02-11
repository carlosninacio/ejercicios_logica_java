public class Ejercicio1 {
    public static void main (String[] args) {

        // Hola y formato: imprime tu nombre, edad y ciudad con System.out.println,
        // luego usa printf para alinear columnas.


        // Primera Solución
        System.out.println("Carlos Ramirez");
        System.out.println(19);
        System.out.println("Cúcuta");
        System.out.println("");
        System.out.printf("""
                Carlos Ramirez
                19
                Cúcuta
                """);

        // Segunda Solución
        String nombre = "Carlos Ramirez";
        int edad = 19;
        String ciudad = "Cúcuta";
        System.out.println("");
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(ciudad);
        System.out.println("");
        System.out.printf("%s | %d | %s%n", nombre, edad, ciudad);

        // Nota: Recordé el uso correcto para un print formateado
    }
}