package decorator.starbuzzocoffeeWithsizes;


/**
 * Created by xulinchao on 2016/3/12.
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
//        super(beverage);
    }


    @Override
    public double cost() {
        return beverage.cost()+0.20;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" ,Mocha";
    }
}
