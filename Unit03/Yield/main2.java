// create a 
class Example1 implements Runnable{
    public void run(){
        System.out.println("Thread is running");
    }
}
public class main2 {
    Thread t1 = new Thread(new Example1());
    Example1 ex = new Example1();
    Thread t2 = new Thread(t1,"Second thread");
    public static void main(String[] args) {
        main2 m = new main2();
        m.t1.start();
        m.t2.start();
    }
}
