 class A{
    public void display(){
        System.out.println("This is class A");
    }
}
final class B extends A{ // This will cause a compile-time error because class A is final and cannot be extended
    public void display(){
        System.out.println("This is class B");
    }
}
public class main {
    public static void main(String[] args) {
        B b = new B();
        b.display();
    }
    
}
