import java.util.ArrayList;
import java.util.Arrays;

public class ex3_9 {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        

        for (int i = 0; i <= 100; i++) {

            if (i % 7 == 0) {
                arr.add(i);
            }
        }

        System.out.println(arr.get(arr.size() - 1));
    }
}