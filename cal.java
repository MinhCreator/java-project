
import java.util.Scanner;



// class Cal {

//     public double  formular(float x, float y) {

//         double numberator = (Math.pow(x * x, 3) + Math.pow(y * y, 3)) - Math.log(x + y) / Math.log(5);

//         double denominator = Math.atan(x - y) + Math.PI / 4;

//         return Math.abs(numberator / denominator);
//     }
// }

// public class calculation {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter x: ");
//         float x = sc.nextFloat();
//         System.out.println("Enter y: ");
//         float y = sc.nextFloat();

//         Cal c = new Cal();
//         System.out.println("Result: " + c.formular(x, y));
//     }
// }

// public class calculation {

//     public static void main(String[] args) {
//         double x;

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter x: ");
//         x = sc.nextDouble();

//         double numberator = Math.pow(x, 3) + Math.log(Math.abs(x - 3) + 2) / Math.log(5);

//         double denominator = Math.atan(x - 5) * Math.atan(x - 5) + 1;

//         System.out.println("Result: " + Math.abs(numberator / denominator));
//     }
// }

// ax**2 + bx + c = 0
public class cal {
    public static void main(String[] args) {
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = sc.nextDouble();
        System.out.println("Enter b: ");
        b = sc.nextDouble();
        System.out.println("Enter c: ");
        c = sc.nextDouble();

        double delta = (b * b) - (4 * a * c);

        if (a != 0 && delta > 0) {

            double x1, x2;
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);

        } 
        else if (a != 0 && delta == 0) {
            double x = -b / (2 * a);
            System.out.println("x = " + x);
        } 
        else if (a != 0 && delta < 0) {

            System.out.println("No real roots");
        } 
        else if (a == 0 && b != 0) {

            double x = -c / b;
            System.out.println("Linear equation, x = " + x);
        } 
        else if (a == 0 && b == 0 && c == 0) {
            
            System.out.println("Infinite solutions");
        } 
        else {
            
            System.out.println("No solution");
        }

    }
}