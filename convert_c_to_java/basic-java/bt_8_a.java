import java.util.Scanner;

public class bt_8_a {
    public static void main(String[] args) {
        float x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the real number: ");
        x = sc.nextFloat();

        double tu = Math.pow(x * x, 1 / 3) + Math.pow(x, 5) + Math.log(Math.pow(x, 4) + 1);
        double mau = x * x + Math.PI/4 ;
        System.out.print("f(x) = " + tu / mau);
    }
}