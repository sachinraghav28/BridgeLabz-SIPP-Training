public class Four {
    public static void main(String[] args) {
        int costprice = 129; 
        int sellingprice = 191; 
        int profit=sellingprice-costprice;
        int profitpercentage=profit/costprice*100;
        System.out.println("Cost price is INR "+ costprice+ " and Selling price is INR " + sellingprice);
        System.out.println("The Profit is INR " + profit + " and the Profit percentage is " + profitpercentage + "%");
    }
    
}
