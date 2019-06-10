package factroy.factorymethod;

import factroy.factorymethod.product.Product;
import factroy.factorymethod.product.ProductB;

/**
 * 工厂方法接口
 *
 * @author YaoS
 * @date 2019-06-10 14:10
 */
public class ProductBFactory implements Factory {
    @Override
    public Product getProduct() {
        System.out.println("Operate ProductB");
        return new ProductB();
    }
}
