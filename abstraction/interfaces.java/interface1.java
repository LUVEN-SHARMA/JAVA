interface A{
    public abstract void show();
}

public interface interface1 {
    public abstract void print();
}

class TestInterface implements A, interface1 {
    @Override
    public void show(){
        System.out.println("hello");
    }
    
    @Override
    public void print(){
        System.out.println("welcome");
    }
}

class Main {
    public static void main(String[] args){
        A t1 = new TestInterface();
        t1.show();
        TestInterface t2 = new TestInterface();
        t2.print();
    }
}