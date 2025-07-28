interface Rentable {
    double calculateRent(int days);
}

abstract class Vehicle implements Rentable {
    protected String model;
    protected double baseRate;
    protected int year;

    public Vehicle(String model, int year, double baseRate) {
        this.model = model;
        this.year = year;
        this.baseRate = baseRate;
    }
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
    public double getBaseRate() { return baseRate; }
    public void setBaseRate(double baseRate) { this.baseRate = baseRate; }
}
class Bike extends Vehicle {
    private double insuranceFee = 85.6;
    public Bike(String model, int year) {
        super(model, year, 15.0);
    }
    @Override
    public double calculateRent(int days) {
        return (baseRate * days) + insuranceFee;
    }
}
class Car extends Vehicle {
    private double insuranceFee = 50.0;

    public Car(String model, int year) {
        super(model, year, 40.0);
    }
    @Override
    public double calculateRent(int days) {
        return (baseRate * days) + insuranceFee;
    }
}
class Truck extends Vehicle {
    private double cargoSurcharge = 75.0;
    public Truck(String model, int year) {
        super(model, year, 60.0);}
    
    @Override
    public double calculateRent(int days) {
        return (baseRate * days) + cargoSurcharge;
    }
}
public class Customer {
    private String name;
    private String email_id;
    public Customer(String name, String email_id) {
        this.name = name;
        this.email_id = email_id;
    }
    public String getname() {
        return name;
    }
    public String getemail() {
        return email_id;
    }
    public void setname(String name) {
        this.name = name;
    }
    public void setemail(String email_id) {
        this.email_id = email_id;
    }
    public void printDetails() {
        System.out.println("Customer Name:-" + name);
        System.out.println("Email ID:-" + email_id);
    }

    public static void main(String[] args) {
        Customer customer = new Customer("sachin", "sachin@gmail.com");
        customer.printDetails();

        Vehicle bike = new Bike("Yamaha", 2021);
        Vehicle car = new Car("Honda", 2020);
        Vehicle truck = new Truck("Volvo", 2019);

        System.out.println("Bike Rent (3 days):- $" + bike.calculateRent(3));
        System.out.println("Car Rent (5 days):- $" + car.calculateRent(5));
        System.out.println("Truck Rent (2 days):- $" + truck.calculateRent(2));
    }
}
