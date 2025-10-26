import java.util.*;

public class ex_1 {
    
    
    public static double smallest_number(double num1, double num2, double num3) {

        double[] arr = { num1, num2, num3 };

        return (double) Arrays.stream(arr).min().getAsDouble() ;
    }
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("enter n1, n2, n3: ");
        double n1 = sc.nextDouble(); 
        double n2 = sc.nextDouble(); 
        double n3 = sc.nextDouble(); 

        System.out.print(smallest_number(n1, n2, n3));

    }
}