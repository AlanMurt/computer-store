package designPatterns;

/**
 * Created by Alan on 07/12/2016.
 */
public abstract class Computer {

    String processor;
    String brand;
    int RAM;
    int storage;

    public void prepareForSale(){
        gatherParts();
        assemble();
        installSoftware();
        box();
    }

    public abstract void gatherParts();


    public void assemble(){
        System.out.println("Computer is assembled");
    }

    public void installSoftware(){
        System.out.println("Software is installed on the computer");
    }

    public void box(){
        System.out.println("Computer is boxed\n");
    }



}
