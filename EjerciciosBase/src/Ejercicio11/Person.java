package Ejercicio11;

public class Person {

    private String nombre;
    private int edad;

    public Person (String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    public void birthday() {
        System.out.println("Cumpliste 1 año, felicidades!");
        this.edad++;
    }
}