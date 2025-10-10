
import java.util.Scanner;

public class bt_9_a {
    
    static double pow(float arg, float arg2) {

        return Math.pow(arg, arg2);
    }

    public static void main(String[] args) {
        float x, y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the real number x and y: ");
        x = sc.nextFloat();
        y = sc.nextFloat();

        double f = Math.cbrt(pow(x, 2) + pow(y, 2) * Math.log(pow(x, 2) + pow(y, 4) + 1) / Math.log(5));

        double f2 = Math.pow(Math.tan(x + y), 2) + Math.PI / 2;

        System.out.println("f(x, y) = " + f / f2);
    }
}