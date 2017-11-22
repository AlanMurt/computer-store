package designPatterns;

public class ComputerStore {
    SimpleComputerFactory factory;

    public ComputerStore(SimpleComputerFactory factory){
        this.factory = factory;
    }

    public Computer orderComputer(String type, boolean addBluetooth, boolean addWebcam){
        Computer computer;

        computer = factory.createComputer(type);

        if(addBluetooth){
            computer = computer.addBluetooth(computer);
        }
        if(addWebcam){
            computer = computer.addWebcam(computer);
        }
        
        System.out.println(computer.getDescription() + " at a cost of €" + computer.cost());
        prepareForSale(computer);

        return computer;
    }


    final void prepareForSale(Computer computer){
        computer.gatherParts();
        computer.assemble();
        computer.installSoftware();
        computer.box();
    }

    void executePayment(Payment paymentMethod){
        paymentMethod.pay();
    }


}
