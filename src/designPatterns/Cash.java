package designPatterns;

/**
 * Created by Alan on 08/12/2016.
 */
public class Cash implements PaymentStrategy {


    public void pay() {
        System.out.println("Selected payment option: Cash\n");
    }
}
