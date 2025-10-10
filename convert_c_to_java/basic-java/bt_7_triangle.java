import java.util.Scanner;

public class bt_7_triangle {
    public static void main(String[] args) {
        double a, b, c, p, s;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b, c : ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        p = (a + b + c) / 2;
        double formula = p * (p - a) * (p - b) * (p - c);
        s = Math.sqrt(formula);

        System.out.print("result of f(x) = " + s);
    }
}