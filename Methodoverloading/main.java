class overload{
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    double add(double a , double b,double c){
        return a+b+c;
    }
    long add(int a, long b){
        return a+b;
    }
}
public class main{
    public static void main(String[] args){
        overload O1 = new overload();
        int r=(int) O1.add(10,20);
        System.out.println(r);
        int r1=O1.add(10,20,30);
        System.out.println(r1);
        double r2=O1.add(10.5,20.5,30.5);
        System.out.println(r2);
        long r3=O1.add(10,2000000000L);
        System.out.println(r3);
        O1.add(10, 20);
        System.out.println(O1);
    }
}