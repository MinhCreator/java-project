import static java.lang.System.out;
import java.util.*;

public class bt_5 {
    public static void main(String[] args) {
        float a,b,c,delta;
        out.printf("Giai phuong trinh bac hai\n");
        Scanner sc = new Scanner(System.in);
        out.printf("nhap he so a, b, c");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        delta= b * b - 4 * a * c;
        if(delta>0) {
           out.printf("\nphuong trinh co 2 nghiem phan biet");
           out.printf("\nnghiem x1=%.2f",(float) (-b- Math.sqrt(delta)) / (2 * a));
           out.printf("\nnghiem x2=%.2f",(float) (-b+ Math.sqrt(delta)) / (2 * a));
           }
        else if(delta==0) out.printf("phuong trinh co nghiem kep x1 = x2 = %.2f",-b/(2*a));  
        else out.printf ("Phuong trinh vo nghiem");

    }
}