package designPatterns;

/**
 * Created by Alan on 07/12/2016.
 */
public class DellComputer extends Computer{
    public DellComputer(){
        description = "Dell Computer";
        setMacAddress(MacAddress.getInstance().generateMacAddress());
    }

    @Override
    public void gatherParts(){
        System.out.println("Parts gathered for Dell computer");
    }

    @Override
    public int cost() {
        return 500;
    }
}
