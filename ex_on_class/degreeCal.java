import java.util.Scanner;
// using Math lib for calculate sin, cos , sqrt
public class degreeCal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("enter random number: ");
        float get_rn = in.nextFloat();

        System.out.print("sin:" + Math.sin(get_rn) + "\n" + "cos: " + Math.cos(get_rn) + "sqrt: " + Math.sqrt(get_rn));

    }
}