interface Sample1{
    void display(String name);
}
public class main1 implements Sample1{
    public void display(String name){
        System.out.println("Hello, " + name);
    }
    public static void main(String[] args) {
        main1 M = new main1();
        M.display("Java");
    }
    
}
