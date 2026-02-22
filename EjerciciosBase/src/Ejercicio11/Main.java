package Ejercicio11;

public class Main {
    public static void main(String[] args) {

        Person persona1 = new Person("Carlos", 19);
        System.out.println(persona1.toString());
        persona1.birthday();
        System.out.println(persona1.toString());
    }
}