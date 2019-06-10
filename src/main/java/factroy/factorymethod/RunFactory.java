package factroy.factorymethod;

import factroy.factorymethod.product.Product;

/**
 * @author YaoS
 * @date 2019-06-10 14:17
 */
public class RunFactory {
    public static void main(String[] args) {
        Factory factoryA = new ProductAFactory();
        Product productA = factoryA.getProduct();
        productA.run();

        Factory factoryB = new ProductAFactory();
        Product productB = factoryB.getProduct();
        productB.run();


    }
}
