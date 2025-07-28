abstract class Product {
    protected String name;
    protected double price;
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public abstract double calculateDiscount();

    public double getFinalPrice() {
        return price - calculateDiscount();
    }

    public void printBill() {
        System.out.println("Product: " + name);
        System.out.println("Original Price: ₹" + price);
        System.out.println("Discount: ₹" + calculateDiscount());
        System.out.println("Final Price: ₹" + getFinalPrice());
        System.out.println("---------------------------");
    }
}
class Electronics extends Product {
    public Electronics(String name, double price) {
        super(name, price);
    }
    @Override
    public double calculateDiscount() {
        return price * 0.10;
    }
}
class Clothing extends Product {
    public Clothing(String name, double price) {
        super(name, price);
    }
    @Override
    public double calculateDiscount() {
        return price * 0.20; 
    }
}
class Grocery extends Product {
    public Grocery(String name, double price) {
        super(name, price);
    }
    @Override
    public double calculateDiscount() {
        return 0.0; 
    }
}
public class ProductBillingSystem {
    public static void main(String[] args) {
        Product[] products = {
            new Electronics("Smartphone", 20000),
            new Clothing("T-Shirt", 1000),
            new Grocery("Rice (5kg)", 500)
        };
        for (Product p : products) {
            p.printBill();
        }
    }
}
