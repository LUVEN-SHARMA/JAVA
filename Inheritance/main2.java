// make three classes class a class b and class c and 
class A{
    void methodA(){
        System.out.println("This is method A");
    }
    private void privateMethod(){
        System.out.println("This is a private method in class A");
    }
}

class B extends A{
    void methodB(){
        System.out.println("This is method B");
    }
}

class C extends B{
    void methodC(){
        System.out.println("This is method C");
    }
}

public class main2 {
    public static void main(String[] args) {
        C obj = new C();
        obj.methodA();
        obj.methodB();
        obj.methodC();
    }
}
