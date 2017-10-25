package designPatterns;

/**
 * Created by Alan on 07/12/2016.
 */
abstract class Computer {

    final void prepareForSale(){
        gatherParts();
        assemble();
        installSoftware();
        box();
    }

    protected abstract void gatherParts();

    //private Payment payment;
    String description = "Unknown Computer";

    private String macAddress;


    String getMacAddress() {
        return macAddress;
    }

    void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    void executePayment(Payment paymentMethod){
        paymentMethod.pay();
    }

    private void assemble(){
        System.out.println("Computer is assembled");
    }

    private void installSoftware(){
        System.out.println("Software is installed on the computer");
    }

    private void box(){
        System.out.println("Computer is boxed");
    }

    String getDescription(){
        return description;
    }

    abstract int cost();

}
