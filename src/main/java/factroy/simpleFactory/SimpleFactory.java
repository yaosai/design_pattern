package factroy.simpleFactory;

/**
 * 简单工厂模式的调用类
 *
 * @author YaoS
 * @date 2019-06-10 13:57
 */
public class SimpleFactory {

    /**
     * 简单工厂反射调用
     *
     * @param c 对象类型
     * @return Product
     * @author YaoS
     * @date 19/6/10 13:59
     */
    private static Product runProject(Class c) {
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return product;
    }

    /**
     * 只需往工厂中传入对象的类型，即可实现对其功能的调用
     *
     * @author YaoS
     * @date 19/6/10 13:59
     */
    public static void main(String[] args) {
        Product productA = SimpleFactory.runProject(ProductA.class);
        productA.run();
        Product productB = SimpleFactory.runProject(ProductB.class);
        productB.run();
    }
}
