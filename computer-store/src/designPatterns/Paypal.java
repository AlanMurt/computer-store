package designPatterns;

/**
 * Created by Alan on 08/12/2016.
 */
public class Paypal implements Payment {
    @Override
    public void pay() {
        System.out.print("Selected payment option: Paypal");
    }
}
