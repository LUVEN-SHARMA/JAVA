// to find area of circle using functional interface
import static java.lang.Math.PI;
import java.util.Scanner;
interface Area {
    double area(double r);
}
public class main5 {
    public static void main(String[] args) {
        Area A = r -> PI * r * r; // lambda function to calculate area of circle
        //System.out.println(A.area(5));
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        System.out.println("Area of the circle with radius " + radius + " is: " + A.area(radius));
        sc.close();

    }
}