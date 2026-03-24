class Example implements Runnable {
    public void run() {
        System.out.println("Thread is running");
    }
}
public class main1 {
    public static void main(String[] args) {
        Example ex = new Example();
        Thread t = new Thread(ex);
        t.start();
    }
}
