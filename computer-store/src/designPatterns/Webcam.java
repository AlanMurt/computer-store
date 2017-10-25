package designPatterns;

/**
 * Created by Alan on 08/12/2016.
 */
public class Webcam extends FeatureDecorator {
    private final Computer computer;

    public Webcam(Computer computer){
        this.computer = computer;
    }

    @Override
    public void gatherParts() {
        System.out.println("Parts gathered for " + computer.getDescription());
    }

    public String getDescription(){
        return computer.getDescription() + ", webcam";
    }

    @Override
    public int cost() {
        return 50 + computer.cost();
    }


}
