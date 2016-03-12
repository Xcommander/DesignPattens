package decorator.starbuzzocoffeeWithsizes;

/**
 * Created by xulinchao on 2016/3/12.
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage b=new HouseBlend();
        b.setSize(Beverage.Size.VENTI);
        b=new Mocha(b);
        b=new Soy(b);
        b=new Mocha(b);

        System.out.println(b.getDescription()+" $"+b.cost());

    }
}
