// define a string parameter
interface Sample3{
    void display(String name);
}
public class main3 {
    public static void main(String[] args) {
        String name = "Java";
        // lambda function with parameter
        Sample3 S = (n) -> System.out.println("Hello, " + n);
        S.display(name);
    }
}
