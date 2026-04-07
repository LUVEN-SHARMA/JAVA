class Parent{
    void display(){
        System.out.println("display in parent class");
    }
}
class Child extends Parent{
    void display(){
        System.out.println("display in child class");
    }
}
public class inner {
    public static void main(String[] args) {
        Child C1= new Child();
        C1.display();
    }
}
