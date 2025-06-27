public class Book {
    private String title;
    private String author;
    private double price;
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }
    
    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}