// addition of two numbers using lamda function
interface Add {
    int add(int a, int b);
}
public class main4 {
    public static void main(String[] args) {
        Add A = (a, b) -> a + b;
        System.out.println(A.add(5, 10));
    }
}
