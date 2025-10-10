public class ex3_13 {
    public static void main(String[] args) {
        int n = 10; // Height of the sandclock (should be odd)
        
        // Top half
        for (int top_height = 0; top_height < n; top_height++) {
            for (int col = 0; col < top_height; col++) {
                System.out.print(" ");
                
            }
            for (int lines = 0; lines < n - 2 * top_height; lines++) {

                if (n - 2 * top_height == 2) {
                    break;
                }

                System.err.print("*");
                
            }
            System.out.println();
        }
        // Bottom half
        for (int bottom_height = n / 2 - 1; bottom_height >=0; bottom_height--) {
            for (int col = 0; col < bottom_height; col++) {
                System.out.print(" ");
                
            }
            for (int lines = 0; lines < n - 2 * bottom_height; lines++) {

                if (n - 2 * bottom_height == 4 || n - 2 * bottom_height == 2) {
                    break;
                }
                System.err.print("*");

                
            }
            System.out.println();
        }
    }
}