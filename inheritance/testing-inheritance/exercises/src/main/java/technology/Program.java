package technology;

public class Program {
    public static void main(String[] args) {
        Computer computer = new Computer(1100, 54, "Homemade");
        Laptop laptop = new Laptop(800, 19, "Cyberpower", 19, 4);
        SmartPhone smartPhone = new SmartPhone(1000, 7, "Galaxy", "Android", 256);

        computer.turnOn();
        computer.turnOff();

        laptop.closeLid();
        laptop.openLid();

        smartPhone.makeCall("Steve");
        smartPhone.textMessage("Sally", "Hey");
    }
}
