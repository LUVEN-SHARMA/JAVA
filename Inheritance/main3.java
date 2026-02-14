class Animal{
    void eat(){
        System.out.println("This animal eats food");
    }
}
class dog extends Animal{
    void bark(){
        System.out.println("woof");
    }
}
class cat{
    void meow(){
        System.out.println("meow");
    }
}
public class main3 {
    public static void main(String[] args) {
        dog d = new dog();
        cat c = new cat();
        d.eat();
        d.bark();
        c.meow();
    }
}
