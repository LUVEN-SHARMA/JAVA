abstract class Example{
    abstract void display();
    void show(){
        System.out.println("show in Abstract class");
    }

}
 class Test extends Example{

    void display(){
       System.out.println("display in test class");
    }
}

public class main {
    public static void main(String[] args) {
        Test t = new Test();
        t.display();
        t.show();
    }
    
}
