package designPatterns;

public class SimpleComputerFactory {
    public Computer createComputer(String type){
        Computer computer = null;

        if (type.equals("Dell")){
            computer = new DellComputer();
        } else if(type.equals("HP")){
            computer = new HPComputer();
        } else if (type.equals("Mac")){
            computer = new MacComputer();
        }
        return computer;
    }
}
