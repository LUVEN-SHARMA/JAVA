class Staticmethod{
    static int add(int x, int y){
        return (x+y);
    }
    static int sub(int x, int y){
        return (x-y);
    }
    static int mul(int x, int y){
        return (x*y);
    }
}






public class main3 {
    public static void main(String[] args){
        System.out.println(Staticmethod.add(10,20));
        System.out.println(Staticmethod.sub(10,20));
        System.out.println(Staticmethod.mul(10,20));
    }
    
}
