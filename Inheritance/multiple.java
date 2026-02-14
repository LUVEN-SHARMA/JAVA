class classA{
    void display(){
        System.out.println("This is class A");
    }
}
interface classB{
    void display();
}
class classC extends classA implements classB{
    @Override
    public void display(){
        System.out.println("This is class C");
    }
}

public class multiple {
    public static void main(String[] args) {
        classC C1 = new classC();
        C1.display();
        // classA a = new classA();
        // classB b = new classB();
        // classC c = new classC();
        // a.display();
        // b.display();
        // c.display();
    }
}
