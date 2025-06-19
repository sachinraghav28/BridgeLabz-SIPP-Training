import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base in cm: ");
        float base = sc.nextFloat();
        System.out.print("Enter height in cm: ");
        float height = sc.nextFloat();

        float areaCm = 0.5f * base * height;
        float areaInches = areaCm / (2.54f * 2.54f);

        System.out.println("The Area of the triangle in sq in is " + areaInches + " and sq cm is " + areaCm);
    }
}
