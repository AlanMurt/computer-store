package designPatterns;

/**
 * Created by Alan on 07/12/2016.
 */
public class HPComputer extends Computer{
    public HPComputer(){
        description = "HP Computer";
        setMacAddress(MacAddress.getInstance().generateMacAddress());
    }

    @Override
    public void gatherParts(){
        System.out.println("Parts gathered for HP computer");
    }

    @Override
    public int cost() {
        return 400;
    }

}
