import java.util.Scanner;

public class lenStr {
//    get length str after enter string
    static int get_str (String input) {

        return input.length();
    }

    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter String: ");
        System.out.print("len of string: " + get_str(input.next()));
    }
}