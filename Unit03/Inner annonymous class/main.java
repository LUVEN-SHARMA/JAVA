class OuterClass{
    class InnerClass{
        void show(){

        }
    }

    public void display() {
        System.out.println("display in outer class");
    }
}
public class main {
    public static void main(String[] args) {
        OuterClass OC = new OuterClass();
        OC.display();
        OuterClass.InnerClass IC = OC.new InnerClass();
        IC.show();
    }
}
