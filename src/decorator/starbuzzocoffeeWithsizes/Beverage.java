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
    /**枚举类，属于内部类，调用时必须先构造外部对象，才能调用
     * 内部类要构造对象，必须现有身体（即外部类对象），才能构造出心脏（匿名类对象）
     * 枚举类TALL，GRANDE，VENTI都是Size类的对象，
     * 从class文件可以看出，TALL等都是实例化的final static的对象，
     * 所以说TALL是可以重写Size的方法的，也就是说枚举类其实也就是个普通的class，
     * 只不过他能后定义初始化对象如TALL
     * **/

    public enum Size{
        TALL,
        GRANDE,
        VENTI,



    }
    Size size=Size.TALL;


    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
