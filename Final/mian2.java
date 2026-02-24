class A{
    final int a=10;// final instance variable
    // final int a; // this is final instance blank variable, it must be initialized in constructor
    // static final int b=20; // final static variable
    void display(int a){
        final int c=30; // final local variable
        // a=c++; // this will cause a compile-time error because a is a final variable and cannot be reassigned
        System.out.println("Value of a: " + a);
    }

}

public class mian2 {
    
}
