// make a parent class and make a child class that inherits the parent class and make the parent class abstract
abstract class shape2{
    abstract void area();
    void display(){
        System.out.println("This is a shape");
    }
    static void show(){
        System.out.println("This is a static method");
    }
}
public class abstract2 {
    public static void main(String[] args) {
        rectangle s;
        s = new rectangle();
        s.area();
        s.display();
        circle c = new circle();
        c.area();
        c.display();
    }
}
