public class ex3_15 {
    public static void main(String[] args) {

        int n = 7;

        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }

            System.out.println();

        }
        for (int i = 0; i <= n; i++) {
            
            System.out.print("  ");
            System.out.print("*");
        }
    }
}