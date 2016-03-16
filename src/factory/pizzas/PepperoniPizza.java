package factory.pizzas;

/**
 * Created by xulinchao on 2016/3/15.
 */
public class PepperoniPizza extends Pizza {
    public PepperoniPizza(){
        name = "Pepperoni Pizza";
        dough = "Crust";
        sauce = "Marinara sauce";
        toppings.add("Sliced Pepperoni");
        toppings.add("Sliced Onion");
        toppings.add("Grated parmesan cheese");
    }
}
