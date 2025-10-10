public class ex3_10 {
    public static void main(String[] args) {
        int s = 0;

        for (int i = 0; i <= 100; i++) {

            if (i % 7 == 0) {
                s += i;
            }
        }
        System.out.println(s);
    }
}