import java.util.Scanner;

public class ex3_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to convert to base 16: ");
        // String re = Integer.toHexString(sc.nextInt());
        String result = String.format("%08x", sc.nextInt());
        // System.out.println(re);
        System.out.print(result);

    }
}