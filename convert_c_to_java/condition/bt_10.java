
import java.util.Scanner;

public class bt_10 {
    public static void main(String[] args) {
        int thu,ngay,thang,nam;
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("nhap ngay=");
        ngay = sc.nextInt();
        
        System.out.printf("nhap thang=");
        thang = sc.nextInt();
        
        System.out.printf("nhap nam=");
        nam = sc.nextInt();
        
        if (thang < 3) {
            thang = thang + 12;
            nam = nam - 1;
        }
        
        thu = ((ngay + 2 * thang + 3 * (thang + 1) / 5 + nam + nam / 4 - nam / 100 + nam / 400) % 7);
        
        switch(thu){
          case 0 -> System.out.printf("Thu hai"); 
          case 1 -> System.out.printf("Thu ba"); 
          case 2 -> System.out.printf("Thu tu"); 
          case 3 -> System.out.printf("Thu nam"); 
          case 4 -> System.out.printf("Thu sau"); 
          case 5 -> System.out.printf("Thu bay"); 
          case 6 -> System.out.printf("Chu nhat"); 
          }
      
          }
}