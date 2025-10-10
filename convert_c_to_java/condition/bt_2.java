import java.util.Scanner;

public class bt_2 {
    public static void main(String[] args) {
        double x, y, x1, x2, x3, max, m;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x , y , x1, x2, x3: ");

        x = sc.nextDouble();
        y = sc.nextDouble();
        x1 = sc.nextDouble();
        x2 = sc.nextDouble();
        x3 = sc.nextDouble();

        if (x > y) {
            max = x;
        } else {
            max = y;
        }
        if (x1 < x2) {
           m = x1;
       } else {
           m = x2;
       }
       if (x3 < m) {
           m = x3;
       }
       
       System.out.print("max, min: " + max + " " +  m);
    }

    
}