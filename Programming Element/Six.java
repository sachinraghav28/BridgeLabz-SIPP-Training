public class Six {
    public static void main(String[] args) {
        int fee =125000;
        int discountpercent = 10;
        int discount = (int) (fee * discountpercent / 100);
        int finaldiscountedfee = fee - discount;
        System.out.print("the dicount amount is INR "+discount+" and final discounted fees is INR "+finaldiscountedfee);
    }
    
}
