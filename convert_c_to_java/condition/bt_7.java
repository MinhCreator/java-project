import java.util.Scanner;

public class bt_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Giải hệ phương trình:");
        System.out.println("a1*x + b1*y = c1");
        System.out.println("a2*x + b2*y = c2");

        System.out.print("Nhập a1: ");
        double a1 = sc.nextDouble();
        System.out.print("Nhập b1: ");
        double b1 = sc.nextDouble();
        System.out.print("Nhập c1: ");
        double c1 = sc.nextDouble();

        System.out.print("Nhập a2: ");
        double a2 = sc.nextDouble();
        System.out.print("Nhập b2: ");
        double b2 = sc.nextDouble();
        System.out.print("Nhập c2: ");
        double c2 = sc.nextDouble();

        double D = a1 * b2 - a2 * b1;
        double Dx = c1 * b2 - c2 * b1;
        double Dy = a1 * c2 - a2 * c1;

        if (D != 0) {
            double x = Dx / D;
            double y = Dy / D;
            System.out.printf("Hệ có nghiệm duy nhất:\nx = %.4f\ny = %.4f\n", x, y);
        } else {
            if (Dx == 0 && Dy == 0) {
                System.out.println("Hệ phương trình có vô số nghiệm.");
            } else {
                System.out.println("Hệ phương trình vô nghiệm.");
            }
        }
    }
}