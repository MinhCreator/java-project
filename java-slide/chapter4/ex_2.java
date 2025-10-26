import java.util.Arrays;
public class ex_2 {
    
    public static int count_vowel(String args) {

        char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y' };
        Integer[] ascii_vowels = {97, 101, 105, 111, 117, 121, 65, 69, 73, 79, 85, 89};

        int count = 0;
        for (int index = 0; index < args.length(); index++) {

            if (Arrays.asList(ascii_vowels).contains((int) args.charAt(index))) {
                count += 1;
            }

        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(count_vowel("An egg is in the nest"));
    }
}