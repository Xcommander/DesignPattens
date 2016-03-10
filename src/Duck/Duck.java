package Duck;

/**
 * Created by xulinchao on 2016/3/8.
 */
public abstract class Duck {
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {

    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }


}

interface FlyBehavior {
    void fly();

    default void xlc() {
        System.out.println("1111");
    }
}

interface QuackBehavior {
    void quack();

    void xlc();
}

class x implements FlyBehavior {

    @Override
    public void fly() {

    }

    {
        xlc();
    }
}
