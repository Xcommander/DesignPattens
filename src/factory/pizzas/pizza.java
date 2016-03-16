package factory.pizzas;

import java.util.ArrayList;

/**
 * Created by xulinchao on 2016/3/15.
 */
public abstract class Pizza {
    public String name;
    public String dough;
    public String sauce;
    ArrayList<String> toppings=new ArrayList<String>();

    public String getName() {
        return name;
    }
    public void prepare(){
        System.out.println("Preparing "+name);
    }

    public void bake(){
        System.out.println("Baking "+name);
    }
    public void cut(){
        System.out.println("Cuttig "+name);
    }
    public void box(){
        System.out.println("Boxing "+name);
    }

    @Override
    public String toString() {
        StringBuffer display=new StringBuffer();
        display.append("----"+name+"----\n");
        display.append(dough+"\n");
        display.append(sauce+"\n");
        for(String s:toppings){
            display.append(s+"\n");
        }
        return display.toString();
    }
}
