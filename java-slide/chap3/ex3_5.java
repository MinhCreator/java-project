public class ex3_5 {
    public static void main(String[] args) {
        int looping = 0;        
        do { 
            if (looping % 2 == 0) {
                
                System.out.println(looping);
            }
            looping += 1;

        } while (looping <= 100);

    }
}