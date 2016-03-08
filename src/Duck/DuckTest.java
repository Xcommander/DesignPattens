package Duck;


/**
 * Created by xulinchao on 2016/3/8.
 */
public class DuckTest extends Duck {
    public static void main(String[] args) {
        DuckTest duckTest=new DuckTest();
        duckTest.setFlyBehavior(new FlyBehavior() {

            @Override
            public void fly() {
                System.out.println("I can fly");
            }
        });
        duckTest.setQuackBehavior(new QuackBehavior() {
            @Override
            public void quack() {

                System.out.println("I can quack");
            }
        });
        duckTest.performFly();
        duckTest.performQuack();
        duckTest.display();

    }

    @Override
    public void display() {
        System.out.println("I'm DuckTest ");
    }
}
