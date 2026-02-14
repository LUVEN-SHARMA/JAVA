class MethodDemo {
    // Normal method
    void normalMethod() {
        System.out.println("This is a normal method.");
        staticMethod();   // normal method calling static method
    }
    // Static method
    static void staticMethod() {
        System.out.println("This is a static method.");
        MethodDemo obj = new MethodDemo();
        obj.thirdMethod();
    }
    void thirdMethod() {
        System.out.println("This is the third method.");
    }
}

public class main5{
    public static void main(String[] args) {

        MethodDemo obj = new MethodDemo();
        obj.normalMethod();   // starting execution
    }
}