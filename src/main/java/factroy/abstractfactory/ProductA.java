package factroy.abstractfactory;

/**
 * @author YaoS
 * @date 2019-06-10 13:54
 */
public class ProductA implements Product {
    @Override
    public void run() {
        System.out.println("Run ProductA");
    }
}
