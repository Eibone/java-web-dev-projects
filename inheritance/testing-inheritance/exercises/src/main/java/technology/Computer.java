package technology;

public class Computer {
    private double price;
    private double caseSize;
    private String brand;

    public Computer(double price, double caseSize, String brand) {
        this.price = price;
        this.caseSize = caseSize;
        this.brand = brand;
    }

    public void turnOn() {
        System.out.println("Computer is turning on");
    }

    public void turnOff() {
        System.out.println("Computer is turning off");
    }
}
