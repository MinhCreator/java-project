import java.util.Scanner;

public class rectangleCal {


    static float area (float width, float height) {
        return  width * height;
    }

    static float perimeter (float width, float height) {
        return  (width + height) * 2;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        float w;
        float h;

        System.out.println("Enter width:" );
        w = in.nextFloat();
        System.out.println("Enter height:" );
        h = in.nextFloat();

        System.out.println("Area: " + area(w, h) + "\n" + "perimeter: " + perimeter(w, h));
    }
}