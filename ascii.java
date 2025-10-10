
import java.util.Scanner;


public class ascii {
    
    public static char Int_To_Ascii(int n) {

        return (char) n;
    }

    public static void main(String[] args) {
        
        System.out.println("get int: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Ascii char is: " + Int_To_Ascii(n));
    }
}

