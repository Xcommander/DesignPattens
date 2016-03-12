package decorator.starbuzzocoffeeWithsizes;

import decorator.starbuzzoffee.Beverage;

/**
 * Created by xulinchao on 2016/3/12.
 */
public class HouseBlend extends decorator.starbuzzocoffeeWithsizes.Beverage {
    public HouseBlend(){
        description="HouseBlend";
    }
    @Override
    public double cost() {
        return 0.89;
    }
//    public  void xlc(){
//        System.out.println("111");
//    }
}
