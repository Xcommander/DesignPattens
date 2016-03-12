package decorator.starbuzzocoffeeWithsizes;

/**
 * Created by xulinchao on 2016/3/12.
 */
public class Espresso extends  Beverage {
    public Espresso(){
        description="Espresso";
    }

    @Override
    public double cost() {
        return 0;
    }

}
