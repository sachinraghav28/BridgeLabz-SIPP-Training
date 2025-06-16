import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km  =sc.nextDouble();
        double mile = km*0.621371;
        System.out.println("The total miles is " +mile+ "mile for the given "+ km );
    }
    
}
