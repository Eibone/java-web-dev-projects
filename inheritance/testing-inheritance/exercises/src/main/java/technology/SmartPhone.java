package technology;

public class SmartPhone extends Computer {
    private String operatingSystem;
    private double storageCapacity;

    public SmartPhone(double price, double caseSize, String brand, String operatingSystem, double storageCapacity) {
        super(price, caseSize, brand);
        this.operatingSystem = operatingSystem;
        this.storageCapacity = storageCapacity;
    }

    public void makeCall(String contact) {
        System.out.println("I'm calling " + contact);
    }

    public void textMessage(String contact, String message) {
        System.out.println("I received a text from " + contact + " " + "that said " + message);
    }
}
