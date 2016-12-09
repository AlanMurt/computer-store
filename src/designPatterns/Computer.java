package designPatterns;

/**
 * Created by Alan on 07/12/2016.
 */
public abstract class Computer {

    private String macAddress;
    //private Payment payment;
    String description = "Unknown Computer";

    public String getMacAddress() {
        return macAddress;
    }

    void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }




    public void executePayment(Payment paymentMethod){
        paymentMethod.pay();
    }



    public final void prepareForSale(){
        gatherParts();
        assemble();
        installSoftware();
        box();
    }

    protected abstract void gatherParts();



    private void assemble(){
        System.out.println("Computer is assembled");
    }

    private void installSoftware(){
        System.out.println("Software is installed on the computer");
    }

    private void box(){
        System.out.println("Computer is boxed");
    }

    public String getDescription(){
        return description;
    }

    public abstract int cost();

}
