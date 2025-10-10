import static java.lang.System.out;
import java.util.*;

public class bt_4 {
    public static void main(String[] args) {
        // a,
        float x,y,tu,mau;
        Scanner sc = new Scanner(System.in);
        out.printf("nhap x, y: ");
        x = sc.nextFloat();
        y = sc.nextFloat();

        if (x != -y) {
            
            tu = (float) Math.pow(x * x, 1.0 / 3) - (float) Math.log(x + y) / (float) Math.log(5);
            
            mau = (float) Math.atan(x-y) + (float) Math.PI/4;
            out.printf("Gia tri cua ham = %.2f", tu / mau);
        }
            
        else
            out.printf(" loi mien xac dinh cua ham ln");

        // b, 
        if (x * x != y) {
            tu = (float) Math.exp(x + y) + (float) Math.log(x * x - y);
            
            mau=(float) Math.cos(x + y) + (float) Math.sin(x);
            out.printf("Gia tri cua ham = %.2f",tu/mau);
        }
        else  out.printf(" loi mien xac dinh cua ham ln"); 

    }
}