interface I1{
    int r=2;
    String name="Luven";
}
interface I2 extends I1{
    void display();
}
public class program1 implements I2{
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+r);
    }
    public static void main(String[] args){
        program1 obj=new program1();
        obj.display();
        System.out.println(program1.r);
    }
}