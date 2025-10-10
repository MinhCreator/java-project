import java.util.Scanner;

public class bt_1 {
    public static void main(String[] args) {
        // a,
        double a, b, c, min;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, b, c: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        else {
            min = a;
        }
        System.out.println("min value: " + min);

        // b,
        float score;
        Scanner get = new Scanner(System.in);
        System.out.println("Enter score: ");

        score = get.nextFloat();

        if (7 <= score && score < 8) {
            System.out.println("K");

        }
        if (score > 8) {
            System.out.println("G");

        }
        else {
            System.out.println("TB");
        }
        

    }
}