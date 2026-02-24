// make a calculator with two interface of addition and subtraction 
interface CalculatorInterface {
    void add(int a, int b);
    void subtract(int a, int b);
}  
class calculations implements CalculatorInterface {
    public void add(int a, int b){
        System.out.println("The sum is: " + (a+b));
    }
    public void subtract(int a, int b){
        System.out.println("The difference is: " + (a-b));
    }
}
public class calculator {
    public static void main(String[] args) {
        calculations c = new calculations();
        c.add(5, 3);
        c.subtract(5, 3);
    }
}