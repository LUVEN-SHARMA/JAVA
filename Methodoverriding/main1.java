class P1 {
    static void staticMethod() {
        System.out.println("Static method in Parent class P1");
    }
    void normalMethod() {
        System.out.println("Normal method in Parent class P1");
    }
}

class C1 extends P1 {
    static void staticMethod() {
        System.out.println("Static method in Child class C1");
    }
    @Override
    void normalMethod() {
        System.out.println("Normal method in Child class C1");
    }
}

public class main1 {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        P1 obj = new C1();

        obj.normalMethod();   
        obj.staticMethod();
    }
}
