class DemoA{
    int r;
    String name;
    void getdata(int x,String y){
        r=x;
        name=y;
    }
    void display(){

        System.out.println(r);
        System.out.println(name);
    }
}


public class Student1 {
    public static void main(String[] args){
        DemoA D1=new DemoA();
        D1.getdata(2,"XYZ");
        D1.display();
    }
}