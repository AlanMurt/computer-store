package designPatterns;

public class ComputerStore {
    SimpleComputerFactory factory;

    public ComputerStore(){
        this.factory = new SimpleComputerFactory();
    }

    public Computer orderComputerWithNoAddedFeature(String type){
        Computer computer;

        computer = factory.createComputer(type);

        System.out.println(computer.getDescription() + " at a cost of €" + computer.cost());
        prepareForSale(computer);

        return computer;
    }

    public Computer orderComputerWithBluetooth(String type){
        Computer computer;

        computer = factory.createComputer(type);
        computer = computer.addBluetooth(computer);

        System.out.println(computer.getDescription() + " at a cost of €" + computer.cost());
        prepareForSale(computer);

        return computer;
    }

    public Computer orderComputerWithWebcam(String type){
        Computer computer;

        computer = factory.createComputer(type);
        computer = computer.addWebcam(computer);

        System.out.println(computer.getDescription() + " at a cost of €" + computer.cost());
        prepareForSale(computer);

        return computer;
    }

    public Computer orderComputerWithBluetoothAndWebcam(String type){
        Computer computer;

        computer = factory.createComputer(type);
        computer = computer.addBluetooth(computer);
        computer = computer.addWebcam(computer);

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

    void executePayment(PaymentContext paymentContext){
        paymentContext.executePayment();
    }


}
