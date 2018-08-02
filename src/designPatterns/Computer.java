package designPatterns;

/**
 * Created by Alan on 07/12/2016.
 */
abstract class Computer {



    abstract void gatherParts();

    //private PaymentStrategy payment;
    String description = "Unknown Computer";

    private String macAddress;


    String getMacAddress() {
        return macAddress;
    }

    void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    void assemble(){
        System.out.println("Computer is assembled");
    }

    void installSoftware(){
        System.out.println("Software is installed on the computer");
    }

    void box(){
        System.out.println("Computer is boxed");
    }

    String getDescription(){
        return description;
    }

    abstract int cost();

    Computer addBluetooth(Computer computer){
        computer = new Bluetooth(computer);
        return computer;
    }

    Computer addWebcam(Computer computer){
        computer = new Webcam(computer);
        return computer;
    }
}
