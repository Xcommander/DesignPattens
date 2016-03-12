package decorator.starbuzzocoffeeWithsizes;

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
        double cost=beverage.cost();
        if(beverage.getSize()==Size.TALL) {
            cost+= 0.10;
        }
        else if(beverage.getSize()==Size.GRANDE)
            cost+= 0.12;
        else if(beverage.getSize()==Size.VENTI)
            cost+= 0.13;
        return cost;

    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" ,Soy";
    }
}
