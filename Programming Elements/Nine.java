import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter fee is  ");
        int fee=sc.nextInt();
        System.out.print("Enter discountpercent is ");
        int discountPercent=sc.nextInt();
        int discountAmount=fee*discountPercent/100;
        int discount = (int) (fee * discountPercent / 100);
        int finaldiscountedfee = fee - discount;
        System.out.print("the dicount amount is INR "+discount+" and final discounted fees is INR "+finaldiscountedfee);
    
    }
    
}
