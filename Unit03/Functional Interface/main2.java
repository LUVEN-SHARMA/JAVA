// lamda function

interface Sample2{
    void display();
}
public class main2 {
    public static void main(String[] args){
        Sample2 S = () -> System.out.println("i am in display method");
        S.display();
    }
}
