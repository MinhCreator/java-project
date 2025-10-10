import java.util.Scanner;

public class bt_3_h_m_s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, h, m, s;
        System.out.print("Enter n, Hour, minus, second following order n-H-M-S : ");

        n = sc.nextInt();
        h = sc.nextInt();
        m = sc.nextInt();
        s = sc.nextInt();

        double minus = (m + (n + s) % 3600 / 60) % 60;
        double hour = (h + (n + s) / 3600) % 24;
        double second = (n + s) % 60;

        System.out.println("result hour, minus, second after n second: " + hour + " " + minus + " " + second);


    }    
}
