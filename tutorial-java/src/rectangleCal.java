import java.util.Scanner;

class rectangleCal {

    public String test (float length, float width){


//        System.out.println("area =  " + length * width);
        return "area =" + length * width;
    }

    static void main() {
        rectangleCal temp = new rectangleCal();
        Scanner scan = new Scanner(System.in);

        System.out.println("enter length");
        float length = scan.nextFloat();

        System.out.println("enter width");
        float width = scan.nextFloat();
        System.out.print(temp.test(length, width));
    }

}
//void main(){
//
//    Main temp = new Main();
//    Scanner scan = new Scanner(System.in);
//
//    System.out.println("enter length");
//    float length = scan.nextFloat();
//
//    System.out.println("enter width");
//    float width = scan.nextFloat();
//    System.out.print(temp.test(length, width));
//
//}