// make a animal class having feild and take constructor to initialize and make a dog class and also a age constructor to initialize age and also a method to display the age of dog

class Animal{
    String name;
    int age;
    Animal(String name){
        this.name=name;
    }
    void display(){
        System.out.println(name);
    }
}
class Dog extends Animal{
    Dog(String name, int age){
        super(name);
        this.age=age;
    }
    void show(){
        System.out.println(name);
        System.out.println(age);
    }
    void displayAge(){
        System.out.println("Age of dog is: "+age);
    }
}

public class main4 {
    public static void main(String[] args) {
        Dog d=new Dog("Tommy", 5);
        d.show();
        d.displayAge();
    }
}