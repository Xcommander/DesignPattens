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

    public enum Size{TALL,GRANDE,VENTI};
    Size size=Size.TALL;

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
