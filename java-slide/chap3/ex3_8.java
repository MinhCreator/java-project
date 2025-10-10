public class ex3_8 {
    
    static int i_sum() {
        int sum = 0;

        for (int i = 0; i < 100; i++) {
            sum += i ;
        }
        


        return sum;
    }

    public static void main(String[] args) {

        int d = i_sum();
        System.out.println("average: " + d / 100);
    }
}