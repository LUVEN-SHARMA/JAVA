class Parent1{
    int a,b;
    void show(){
        System.out.println(a+" and "+b);
    }
}
class Child1 extends Parent1{
    int c;
    void display(){
        System.out.println(c);
       }
       void getsum(){
        System.out.println(a+b+c);
       }
    }
public class main1 {
    public static void main(String[] args) {
        Parent1 p = new Parent1();
        p.a=10;
        p.b=20;
        p.show();
        Child1 c1 = new Child1();
        c1.a=10;
        c1.b=20;
        c1.c=30;
        c1.show();
        c1.display();
        c1.getsum();
    }
    
}
