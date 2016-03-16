package factory.pizzas;

/**
 * Created by xulinchao on 2016/3/15.
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if("cheese".equals(type))
            pizza=new CheesePizza();
        else if("clam".equals(type))
            pizza=new ClamPizza();
        else if("veggie".equals(type))
            pizza=new VeggiePizza();
        return pizza;
    }
}
