package factory.pizzas;

/**
 * Created by xulinchao on 2016/3/15.
 */
public class PizzaTestDriver {
    public static void main(String[] args) {
        PizzaStore store=new PizzaStore(new SimplePizzaFactory());
        Pizza pizza= store.orderPizza("cheese");
        System.out.println(pizza.toString());
    }
}
