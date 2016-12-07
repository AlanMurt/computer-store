package designPatterns;

/**
 * Created by Alan on 07/12/2016.
 */
public class Driver {
    public static void main(String args[]){

        DellComputer dellComputer = new DellComputer();
        dellComputer.prepareForSale();

        MacComputer macComputer = new MacComputer();
        macComputer.prepareForSale();

        HPComputer hpComputer = new HPComputer();
        hpComputer.prepareForSale();
    }
}
