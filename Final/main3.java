class Example {
    final static int age=10; 
}

public class main3 {
    final int n=10; // instance variable
    public static void main(String[] args) {
        System.out.println(Example.age); // accessing static variable using class name
        //int b=(Example.age)++; // this will cause a compile-time error because age is a final variable and cannot be reassigned
        //main3 m= new main3();
       // System.out.println(m.n); // accessing instance variable using object reference
       // int b =m.m++; // this will cause a compile-time error because n is a final variable and cannot be reassigned
    }
    
}
