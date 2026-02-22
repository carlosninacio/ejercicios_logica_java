package Ejercicio11;

public class Person {

    private String name;
    private int edad;

    public Person (String name, int edad) {
        this.name = name;
        this.edad = edad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", edad=" + edad +
                '}';
    }

    public void birthday() {
        System.out.println("Cumpliste 1 año, felicidades!");
        this.edad = ++this.edad;
    }
}