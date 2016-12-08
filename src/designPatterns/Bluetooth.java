package designPatterns;

/**
 * Created by Alan on 08/12/2016.
 */
public class Bluetooth extends Computer{
    Computer computer;

    public Bluetooth(Computer computer){
        this.computer = computer;
    }

    @Override
    public void gatherParts() {
        System.out.println("Parts gathered for " + computer.getDescription());
    }

    public String getDescription(){
        return computer.getDescription() + ", bluetooth";
    }

    @Override
    public int cost() {
        return 30 + computer.cost();
    }
}
