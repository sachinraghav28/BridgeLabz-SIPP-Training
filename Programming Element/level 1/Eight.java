import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter km ");
        double km  =sc.nextInt();
        double mile = km*0.621371;
        System.out.println("The total miles is " +mile+ "mile for the given "+ km );
    }
    
}
