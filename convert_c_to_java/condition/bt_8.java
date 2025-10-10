import java.util.Scanner;

public class bt_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Giải hệ phương trình ba ẩn:");
        System.out.println("a1*x + b1*y + c1*z = d1");
        System.out.println("a2*x + b2*y + c2*z = d2");
        System.out.println("a3*x + b3*y + c3*z = d3");

        System.out.print("Nhập a1: ");
        double a1 = sc.nextDouble();
        System.out.print("Nhập b1: ");
        double b1 = sc.nextDouble();
        System.out.print("Nhập c1: ");
        double c1 = sc.nextDouble();
        System.out.print("Nhập d1: ");
        double d1 = sc.nextDouble();

        System.out.print("Nhập a2: ");
        double a2 = sc.nextDouble();
        System.out.print("Nhập b2: ");
        double b2 = sc.nextDouble();
        System.out.print("Nhập c2: ");
        double c2 = sc.nextDouble();
        System.out.print("Nhập d2: ");
        double d2 = sc.nextDouble();

        System.out.print("Nhập a3: ");
        double a3 = sc.nextDouble();
        System.out.print("Nhập b3: ");
        double b3 = sc.nextDouble();
        System.out.print("Nhập c3: ");
        double c3 = sc.nextDouble();
        System.out.print("Nhập d3: ");
        double d3 = sc.nextDouble();

        // Tính các định thức theo quy tắc Cramer
        double D = a1 * (b2 * c3 - b3 * c2) - b1 * (a2 * c3 - a3 * c2) + c1 * (a2 * b3 - a3 * b2);
        double Dx = d1 * (b2 * c3 - b3 * c2) - b1 * (d2 * c3 - d3 * c2) + c1 * (d2 * b3 - d3 * b2);
        double Dy = a1 * (d2 * c3 - d3 * c2) - d1 * (a2 * c3 - a3 * c2) + c1 * (a2 * d3 - a3 * d2);
        double Dz = a1 * (b2 * d3 - b3 * d2) - b1 * (a2 * d3 - a3 * d2) + d1 * (a2 * b3 - a3 * b2);

        if (D != 0) {
            double x = Dx / D;
            double y = Dy / D;
            double z = Dz / D;
            System.out.printf("Hệ có nghiệm duy nhất:\nx = %.4f\ny = %.4f\nz = %.4f\n", x, y, z);
        } else {
            if (Dx == 0 && Dy == 0 && Dz == 0) {
                System.out.println("Hệ phương trình có vô số nghiệm.");
            } else {
                System.out.println("Hệ phương trình vô nghiệm.");
            }
        }
    }
}