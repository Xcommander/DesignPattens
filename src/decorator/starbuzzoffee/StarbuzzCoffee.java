package decorator.starbuzzoffee;



/**
 * Created by xulinchao on 2016/3/12.
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage b1=new Espresso();
        System.out.println(b1.getDescription()+" $"+b1.cost());
        Beverage b2=new HouseBlend();
        b2=new Mocha(b2);
        b2=new Mocha(b2);
        b2=new Soy(b2);
        b2=new Whip(b2);
        System.out.println(b2.getDescription()+" $"+b2.cost());
    }
}
