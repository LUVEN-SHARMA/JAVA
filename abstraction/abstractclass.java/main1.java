// make a calculator class and make a child class that inherits the calculator class and make the calculator class abstract
abstract class Calculator{
    abstract void add(int a, int b);
    void show(){
        System.out.println("This is a calculator");
    }
}
class Test extends Calculator{  
    void add(int a, int b){
        System.out.println("The sum is: " + (a+b));
    }
}


public class main1 {
    public static void main(String[] args) {
        Test t = new Test();
        t.add(5, 3);
        t.show();
    }
}
