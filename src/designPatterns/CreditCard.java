package designPatterns;

/**
 * Created by Alan on 08/12/2016.
 */
public class CreditCard implements PaymentStrategy {


    public void pay() {
        System.out.println("Selected payment option: Credit Card\n");
    }
}
