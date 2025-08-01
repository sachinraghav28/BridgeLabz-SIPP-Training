package scenariobasefolder;

import java.util.*;

class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return id + ": " + name + " - ₹" + price;
    }
}

class Cart {
    private List<Product> items = new ArrayList<>();

    public void addProduct(Product product) {
        items.add(product);
        System.out.println(product.getName() + " added to cart.");
    }

    public void removeProduct(int productId) {
        items.removeIf(p -> p.getId() == productId);
        System.out.println("Product removed from cart.");
    }

    public double getTotal() {
        double total = 0;
        for (Product p : items) {
            total += p.getPrice();
        }
        return total;
    }

    public void showCart() {
        if (items.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }
        System.out.println("Cart contents:");
        for (Product p : items) {
            System.out.println(p);
        }
        System.out.println("Total: ₹" + getTotal());
    }

    public void checkout() {
        if (items.isEmpty()) {
            System.out.println("Cart is empty. Add products before checkout.");
            return;
        }
        System.out.println("Checking out. Total amount: ₹" + getTotal());
        items.clear();
        System.out.println("Thank you for your purchase!");
    }
}

public class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Product> products = Arrays.asList(
            new Product(1, "Laptop", 50000),
            new Product(2, "Phone", 20000),
            new Product(3, "Headphones", 1500),
            new Product(4, "Book", 500)
        );

        Cart cart = new Cart();

        while (true) {
            System.out.println("\n--- E-Commerce Menu ---");
            System.out.println("1. List Products");
            System.out.println("2. Add to Cart");
            System.out.println("3. Remove from Cart");
            System.out.println("4. View Cart");
            System.out.println("5. Checkout");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Available Products:");
                    for (Product p : products) {
                        System.out.println(p);
                    }
                    break;
                case 2:
                    System.out.print("Enter Product ID to add: ");
                    int addId = sc.nextInt();
                    products.stream()
                        .filter(p -> p.getId() == addId)
                        .findFirst()
                        .ifPresentOrElse(cart::addProduct, () -> System.out.println("Product not found."));
                    break;
                case 3:
                    System.out.print("Enter Product ID to remove: ");
                    int removeId = sc.nextInt();
                    cart.removeProduct(removeId);
                    break;
                case 4:
                    cart.showCart();
                    break;
                case 5:
                    cart.checkout();
                    break;
                case 6:
                    System.out.println("Exiting. Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
