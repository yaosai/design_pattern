package factroy.factorymethod.product;

import factroy.factorymethod.product.Product;

/**
 * @author YaoS
 * @date 2019-06-10 13:54
 */
public class ProductB implements Product {
    @Override
    public void run() {
        System.out.println("Run ProductB");
    }
}
