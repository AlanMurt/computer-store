package designPatterns;

/**
 * Created by Alan on 07/12/2016.
 */
public abstract class Computer {

    //Strategy
    private Payment payment;
    String description = "Unknown Computer";


    public void executePayment(Payment paymentMethod){
        paymentMethod.pay();
    }
    //END Strategy



    public final void prepareForSale(){
        gatherParts();
        assemble();
        installSoftware();
        box();
    }

    protected abstract void gatherParts();



    private void assemble(){
        System.out.println("Computer is assembled");
    }

    private void installSoftware(){
        System.out.println("Software is installed on the computer");
    }

    private void box(){
        System.out.println("Computer is boxed");
    }


   // public abstract void addMacAddress();

   /* public String randomMACAddress(){
        Random rand = new Random();
        byte[] macAddr = new byte[6];
        rand.nextBytes(macAddr);

        macAddr[0] = (byte)(macAddr[0] & (byte)254);  //zeroing last 2 bytes to make it unicast and locally adminstrated

        StringBuilder sb = new StringBuilder(18);
        for(byte b : macAddr){

            if(sb.length() > 0)
                sb.append(":");

            sb.append(String.format("%02x", b));
        }


        return sb.toString();
    }   */

   //Decorator

    public String getDescription(){
        return description;
    }

    public abstract int cost();

}
