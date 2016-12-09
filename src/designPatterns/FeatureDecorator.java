package designPatterns;

/**
 * Created by Alan on 08/12/2016.
 */
abstract class FeatureDecorator extends Computer{
    protected Computer decoratedComputer;

    abstract String getDescription();


}
