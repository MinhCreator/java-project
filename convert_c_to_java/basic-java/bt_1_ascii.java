
import java.util.Scanner;

public class bt_1_ascii {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int in = sc.nextInt();

        System.out.println("ascii symbol is: " + (char) in);
    }
}