class Parent{
    void display(){
        privateMethod();
        System.out.println("i am in display() method of parent class");
    }
    void privateMethod(){
        System.out.println("i am in private method of parent class");
    }
}
class Child extends Parent{
    // void display(){
        // System.out.println("i am in display method of child class");
    // }
        void show(){
            System.out.println("i am in show() method of child class");
        }
    }
public class main {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
        c.show();
        c.privateMethod(); // this will give error because private method of parent class is not accessible in child class
    }
}