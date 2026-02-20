// make a animal class having feild and take constructor to initialize and make a dog class and also a age constructor to initialize age and also a method to display the age of dog

class Animal{
    String name;
    int age;
    Animal(String name, int age){
        this.name=name;
        this.age=age;
    }
}
class Dog extends Animal{
    Dog(String name, int age){
        super(name, age);
    }
    void displayAge(){
        System.out.println("Age of dog is: "+age);
    }
}

public class main4 {
    public static void main(String[] args) {
        Dog d=new Dog("Tommy", 5);
        d.displayAge();
    }
}