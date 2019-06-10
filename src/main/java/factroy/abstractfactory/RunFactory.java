package factroy.abstractfactory;

import factroy.abstractfactory.product.Product;
import factroy.abstractfactory.product.ProductX;

/**
 * 生产产品
 *
 * @author YaoS
 * @date 2019-06-10 15:24
 */
public class RunFactory {
    public static void main(String[] args) {
        Product product = null;
        product = new ProductX();
        product.create();
    }
}
