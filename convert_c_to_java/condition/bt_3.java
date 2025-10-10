import java.util.Scanner;

public class bt_3 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Nhap vao 1 ki tu : ");
        
        char ch = sc.next().charAt(0);
        int chr = (int) ch;

        if (ch >= 'a' && ch <= 'z') {
         
            System.out.print("\n Chuyen thanh hoa " + String.format("%c", chr - 32));
        }
        else if (ch >= 'A' && ch <= 'Z') {
        
            System.out.print("\n Chuyen thanh thuong " + String.format("%c", chr + 32));
        }


    }
}