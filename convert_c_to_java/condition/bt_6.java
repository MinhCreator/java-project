import static java.lang.System.out;
import java.util.*;


public class bt_6 {

    // t = x^2

    // public static void main(String[] args) {
    // double a, b, c, delta, t, t1, t2;
    // Scanner sc = new Scanner(System.in);
    // out.print("enter a, b, c with a != 0: ");
    // a = sc.nextDouble();
    // b = sc.nextDouble();
    // c = sc.nextDouble();
    // 
    // delta = (b * b) - (4 * a * c);
    //    
    // if (delta < 0) {
    // out.print("The equation has no real roots");
    // } 
    // else if (delta > 0) {
    // t1 = (-b + Math.sqrt(delta)) / (2 * a);
    // t2 = (-b - Math.sqrt(delta)) / (2 * a);
    // 
    // create new roots array
    // ArrayList<Double> root = new ArrayList<>();
    // 
    // 
    // if (t1 >= 0) {
    // double x1 = (double) Math.sqrt(t1);
    // double x2 = -x1;
    // 
    // if (!root.contains(x1)) {
    // root.add(x1);
    // }
    // if (!root.contains(x2)) {
    // root.add(x2);
    // } 
    // 
    // }
    // if (t2 != t1 && t2 >= 0) {
    // double x3 = Math.sqrt(t2);
    // double x4 = -x3;
    // 
    // if (!root.contains(x3)) {
    // root.add(x3);
    // }
    // 
    // if (!root.contains(x4)) {
    // root.add(x4);
    // }
    // 
    // }
    // if (root.size() == 0) {
    // out.print("the equation has no real root.");
    // } else {
    // out.println("number of root: ");
    // 
    // for (double ro : root) {
    // out.print(ro);
    // }
    // out.println();
    // }
    // }
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a (a ≠ 0): ");
        double a = sc.nextDouble();
        System.out.print("Nhập b: ");
        double b = sc.nextDouble();
        System.out.print("Nhập c: ");
        double c = sc.nextDouble();

        if (a == 0) {
            System.out.println("a phải khác 0!");
            return;
        }

        // Đặt y = x^2, phương trình trở thành: a*y^2 + b*y + c = 0
        double delta = b * b - 4 * a * c;
        int soNghiem = 0;

        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm thực.");
        } else {
            double y1 = (-b + Math.sqrt(delta)) / (2 * a);
            double y2 = (-b - Math.sqrt(delta)) / (2 * a);

            // Tìm nghiệm x từ y1
            if (y1 >= 0) {
                double x1 = Math.sqrt(y1);
                double x2 = -Math.sqrt(y1);
                if (x1 == x2) {
                    System.out.printf("Nghiệm: x = %.4f\n", x1);
                    soNghiem++;
                } else {
                    System.out.printf("Nghiệm: x = %.4f, x = %.4f\n", x1, x2);
                    soNghiem += 2;
                }
            }

            // Tìm nghiệm x từ y2 (nếu khác y1)
            if (y2 != y1 && y2 >= 0) {
                double x3 = Math.sqrt(y2);
                double x4 = -Math.sqrt(y2);
                if (x3 == x4) {
                    System.out.printf("Nghiệm: x = %.4f\n", x3);
                    soNghiem++;
                } else {
                    System.out.printf("Nghiệm: x = %.4f, x = %.4f\n", x3, x4);
                    soNghiem += 2;
                }
            }

            if (soNghiem == 0) {
                System.out.println("Phương trình vô nghiệm thực.");
            } else {
                System.out.println("Số nghiệm thực khác nhau: " + soNghiem);
            }
        }
    }
}
