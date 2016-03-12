package decorator.starbuzzoffee;

/**
 * Created by xulinchao on 2016/3/12.
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost()+0.3;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" ,Soy";
    }
}
