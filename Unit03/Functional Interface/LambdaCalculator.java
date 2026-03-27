// import java.util.Scanner;
// interface Calculator {
//     double operation(double a, double b);
// }
// interface Square {
//     double calculate(double a);
// }
// public class LambdaCalculator {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         Calculator add = (a, b) -> a + b;
//         Calculator sub = (a, b) -> a - b;
//         Calculator mul = (a, b) -> a * b;
//         Calculator div = (a, b) -> {
//             if (b == 0) {
//                 System.out.println("Division by zero not allowed!");
//                 return 0;
//             }
//             return a / b;
//         };
//         Square square = (a) -> a * a;
//         System.out.println("Enter first number:");
//         double num1 = sc.nextDouble();
//         System.out.println("Enter second number:");
//         double num2 = sc.nextDouble();
//         System.out.println("\nChoose Operation:");
//         System.out.println("1. Addition");
//         System.out.println("2. Subtraction");
//         System.out.println("3. Multiplication");
//         System.out.println("4. Division");
//         System.out.println("5. Square of first number");
//         int choice = sc.nextInt();
//         switch (choice) {
//             case 1:
//                 System.out.println("Result = " + add.operation(num1, num2));
//                 break;
//             case 2:
//                 System.out.println("Result = " + sub.operation(num1, num2));
//                 break;
//             case 3:
//                 System.out.println("Result = " + mul.operation(num1, num2));
//                 break;
//             case 4:
//                 System.out.println("Result = " + div.operation(num1, num2));
//                 break;
//             case 5:
//                 System.out.println("Square = " + square.calculate(num1));
//                 break;
//             default:
//                 System.out.println("Invalid choice!");
//         }

//         sc.close();
//     }
// }


interface Calc {
    double square(double n);
    default double sum(int a,int b){
        return a+b;
    }
    default double sub(int a,int b){
        return a-b;
    }
    static double mul(int a, int b){
        return a*b;
    }
    static double div(int a , int b){
        return a/b;
    }
}
public class LambdaCalculator{
    public static void main(String[] args) {
        Calc C1 = (double n)->n*n;
        double r1 = C1.square(2.5);
        System.out.println(r1);
        double r2 = Calc.mul(10,2);
        System.out.println(r2);
        double r3 = C1.sum(10,20);
        System.out.println(r3);
         double r4 = C1.sub(10,20);
        System.out.println(r4);
         double r5 = Calc.div(1000,20);
        System.out.println(r5);
    }
}