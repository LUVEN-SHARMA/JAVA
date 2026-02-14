class P2{
    void display(){
        System.out.println("p2 class static show");
    }
}
class C2 extends P2{
    void display(){
        System.out.println("c2 class static show");
    }

    public static void show() {
        System.out.println("c2 class static show");
        // TODO Auto-generated method stub
      //   throw new UnsupportedOperationException("Unimplemented method 'show'");
    }
}

public class main2 {
    public static void main(String[] args) {
        C2 C = new C2();
        C.display();
        C2.show();
        

    }
}
