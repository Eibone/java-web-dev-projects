package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        CD mixCD = new CD(250, 200, 500, 0);
        mixCD.spinDisc();
        mixCD.writeData("One", 10);
        // TODO: Call each CD and DVD method to verify that they work as expected.
    }
}