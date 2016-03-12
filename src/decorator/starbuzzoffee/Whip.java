package decorator.starbuzzoffee;


/**
 * Created by xulinchao on 2016/3/12.
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost()+.90;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" ,Whip";
    }
}
