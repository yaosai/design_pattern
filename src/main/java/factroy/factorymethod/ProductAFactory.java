package factroy.factorymethod;

import factroy.factorymethod.product.Product;
import factroy.factorymethod.product.ProductA;

/**
 * 工厂方法接口
 *
 * @author YaoS
 * @date 2019-06-10 14:10
 */
public class ProductAFactory implements Factory {
    @Override
    public Product getProduct() {
        System.out.println("Operate ProductA");
        return new ProductA();
    }
}
