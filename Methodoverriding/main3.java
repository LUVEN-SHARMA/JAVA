// constructor overloading example

class Parents{
    Parents(){
        System.out.println("parent5 class");
    }
}
class Child5 extends Parents{
    Child5(){
        System.out.println("child5 class");
    }
}



public class main3 {
     public static void main(String[] args) {
        Child5 C=new Child5();
    }  
}
