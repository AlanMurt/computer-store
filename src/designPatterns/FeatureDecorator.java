package designPatterns;

/**
 * Created by Alan on 08/12/2016.
 */
public abstract class FeatureDecorator extends Computer{
    protected Computer decoratedComputer;

    public abstract String getDescription();


}