import java.util.*;
public class bt_9 {
    public static void main(String[] args) {
        double thu,day, month, year, nextYear;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter thu, day, month, year: ");
        thu = sc.nextDouble();
        day = sc.nextDouble();
        month = sc.nextDouble();
        year = sc.nextDouble();

        nextYear = year + 1;

        if (nextYear % 4 == 0 || nextYear % 400 == 0) {
            thu += 2;
            System.out.println("thu " + thu + " month " + month + " year " + nextYear);

        } else {
            thu += 1;
            System.out.println("thu " + thu + " month " + month + " year " + nextYear);

        } 
    }
}
