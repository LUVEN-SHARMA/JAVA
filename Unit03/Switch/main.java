import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the day: ");
        //int r= S.nextInt();
        String r1=S.nextLine();
        switch(r1){
            case "Monday":
                System.out.println("Monday");
                break;
            case "Tuesday":
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Default");
        }
        S.close();

    }
}
