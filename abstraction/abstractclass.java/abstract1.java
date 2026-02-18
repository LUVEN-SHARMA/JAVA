abstract class shape1{
    abstract void area();
    void display(){
        System.out.println("This is a shape");
    }
}

class rectangle extends shape1{
    public void area(){
        System.out.println("Rectangle");
    }
}

class circle extends shape1{
    public void area(){
        System.out.println("Circle");
    }
}
class AbstractMethod{
    public static void main(String[] args) {
        shape1 s;
        s = new rectangle();
        s.area();
        s.display();
        s = new circle();
        s.area();
        s.display();
    }
}

public class abstract1 {
    public static void main(String[] args) {
        rectangle r = new rectangle();
        circle c = new circle();
        r.area();
        c.area();
    }
}