package designPatterns;

/**
 * Created by Alan on 07/12/2016.
 */
class Driver {
    public static void main(String args[]){



        //order a dell computer with no added features
        //Computer dellComputer1 = new DellComputer();
        //dellComputer1.prepareForSale();
        //System.out.println("\n");

        //order a dell computer with bluetooth only
        //Computer dellComputer2 = new DellComputer();
        //dellComputer2 = new Bluetooth(dellComputer2);
        //System.out.println(dellComputer2.getDescription() + " at a cost of €" + dellComputer2.cost());
        //dellComputer2.prepareForSale();
        //System.out.println("\n");

        //order a dell computer with bluetooth and webcam (Decorator)
        //Computer dellComputer3 = new DellComputer();
        //dellComputer3 = new Bluetooth(dellComputer3);
        //dellComputer3 = new Webcam(dellComputer3);
        //System.out.println(dellComputer3.getDescription() + " at a cost of €" + dellComputer3.cost());
        //dellComputer3.prepareForSale();
        //dellComputer3.executePayment(new Paypal());
        //System.out.println("\n");

        //MacAddress.getInstance().generateMacAddress();

        //Use Computer.java to see change in behaviour when it changes strategy

        //Computer macComputer = new MacComputer();
        //macComputer.prepareForSale();
        //macComputer.getMacAddress();
        //System.out.println("Mac Address: " + macComputer.getMacAddress());
        //System.out.println("\n");

        //Computer hpComputer = new HPComputer();
        //hpComputer.prepareForSale();
        //hpComputer.executePayment((new Cash()));
        //System.out.println("\n");


        //SimpleComputerFactory factory1 = new SimpleComputerFactory();
        ComputerStore cs = new ComputerStore();
        cs.orderComputerWithBluetooth(ComputerMake.HP.name());
        PaymentContext paymentContext = new PaymentContext(new Cash());
        cs.executePayment(paymentContext);

        //todo: send email (builder)


        //SimpleComputerFactory factory2 = new SimpleComputerFactory();
        //cs = new ComputerStore(factory2);
        //cs.orderComputer("Dell", true, true);
        //cs.executePayment((new Paypal()));

        //SimpleComputerFactory factory3 = new SimpleComputerFactory();
        //cs = new ComputerStore(factory3);
        //cs.orderComputer("Mac", false, true);
        //cs.executePayment((new CreditCard()));

    }
}

