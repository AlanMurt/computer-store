package designPatterns;

/**
 * Created by Alan on 07/12/2016.
 */
public class MacComputer extends Computer{

    public MacComputer() {
        description = "Mac Computer";
        setMacAddress(MacAddress.getInstance().generateMacAddress());
    }

    @Override
    public void gatherParts(){
        System.out.println("Parts gathered for Mac computer");
    }

    @Override
    public int cost() {
        return 800;
    }


}
