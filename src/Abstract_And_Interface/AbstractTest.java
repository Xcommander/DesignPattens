package Abstract_And_Interface;

/**
 * Created by xulinchao on 2016/3/8.
 */
/**
 * 包含抽象方法的类称为抽象类，但并不意味着抽象类中只能有抽象方法，它和普通类一样，同样可以拥有成员变量和普通的成员方法。
 * 注意，抽象类和普通类的主要有三点区别：

 　　1）抽象方法必须为public或者protected（因为如果为private，则不能被子类继承，子类便无法实现该方法），缺省情况下默认为public。

 　　2）抽象类不能用来创建对象；

 　　3）如果一个类继承于一个抽象类，则子类必须实现父类的抽象方法。如果子类没有实现父类的抽象方法，则必须将子类也定义为为abstract类。

 　　在其他方面，抽象类和普通的类并没有区别。

 *
 * **/
public abstract class AbstractTest {
    public  abstract void say();
}
