package Abstract_And_Interface;

/**
 * Created by xulinchao on 2016/3/8.
 */
public class Test {
    public static void main(String[] args) {
        /**抽象类不能被实例化，要实例化必须用子类继承，
         * 抽象类的抽象方法必须在不能实现，只能在子类中override
         * **/
        AbstractTest a=new AbstractTest() {
            @Override
            public void say() {

            }
        };
    }
}
