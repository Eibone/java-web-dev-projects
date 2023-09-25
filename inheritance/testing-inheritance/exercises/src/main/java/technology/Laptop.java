package technology;

public class Laptop extends Computer {
    private double screenSize;
    private int batteryLife;

    public Laptop(double price, double caseSize, String brand, double screenSize, int batteryLife) {
        super(price, caseSize, brand);
        this.screenSize = screenSize;
        this.batteryLife = batteryLife;
    }

    public void openLid() {
        System.out.println("Lid is opened");
    }

    public void closeLid() {
        System.out.println("Lid is closed");
    }
}
