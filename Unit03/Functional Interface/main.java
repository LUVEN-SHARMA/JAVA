interface Sample{
    void display();
}
public class main implements Sample{
    public void display(){
        System.out.println("i am in display method");
    }
    public static void main(String[] args) {
        main obj = new main();
        obj.display();
    }
}
