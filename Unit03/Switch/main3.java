import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int r= S.nextInt();
        int res=switch(r){
            case 1:
                yield 100;
            case 2:
                yield 300;
            default:
                yield 0;
        };
        System.out.println(res);
        S.close();
    }
}
