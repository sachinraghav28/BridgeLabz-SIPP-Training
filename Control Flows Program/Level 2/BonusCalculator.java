import java.util.Scanner;
public class BonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        if (years > 5) {
            System.out.println("Bonus: ₹" + (salary * 0.05));
        } else {
            System.out.println("No bonus.");
        }
        sc.close();
    }
}


