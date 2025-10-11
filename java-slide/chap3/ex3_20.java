
import java.util.Scanner;

public class ex3_20 {
    
    public static int factorial(int num) {
        int[] arr = new int[num + 1];
        arr[0] = 1;
        // arr[1] = 1;

        for (int i = 1; i <= num; i++) {

            arr[i] = i * arr[i - 1];

        }
        return arr[num];
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number for factorial: ");
        int n = sc.nextInt();

        System.out.println("factorial of number : " + factorial(n));

        
    }
}