interface Example2{
    void display();
}
public class main6 {
    int a;
    main6(int a){
        this.a = a;
    }
    void show(){
        Example2 E2= ()->System.out.println(a); // lamda func
        E2.display();
    }
    public static void main(String[] args) {
        main6 M1 = new main6(10);
        M1.show();
    }
}