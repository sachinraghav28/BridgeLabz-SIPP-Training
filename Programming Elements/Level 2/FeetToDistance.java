import java.util.Scanner;

public class FeetToDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        float distanceFeet = sc.nextFloat();

        float yards = distanceFeet / 3;
        float miles = yards / 1760;

        System.out.println("The distance in yards is " + yards + " while the distance in miles is " + miles);
    }
}
