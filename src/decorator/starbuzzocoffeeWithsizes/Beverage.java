package decorator.starbuzzocoffeeWithsizes;

/**
 * Created by xulinchao on 2016/3/12.
 */
public abstract class Beverage {
    public abstract double cost();

    public String getDescription() {
        return description;
    }


    public String description="Unknow Beverage";

    public String getSize() {
        return size;
    }

    public String size;

    public void setSize(String size) {
        this.size = size;
    }

}
