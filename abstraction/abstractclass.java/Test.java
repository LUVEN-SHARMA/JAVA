// using constructor in abstract class

abstract class Animal {
    String name;
    Animal(String name) {  // Constructor
        this.name = name;
        System.out.println("Animal constructor called");
    }
    abstract void sound();
}
class Dog extends Animal {
    Dog(String name) {
        super(name);  // Calling abstract class constructor
        System.out.println("Dog constructor called");
    }
    void sound() {
        System.out.println("Dog barks");
    }
}
public class Test {
    public static void main(String[] args) {
        Dog d = new Dog("Tommy");
        d.sound();
    }
}