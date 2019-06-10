package factroy.factorymethod;

import factroy.factorymethod.product.Product;

/**
 * 工厂方法接口
 *
 * @author YaoS
 * @date 2019-06-10 14:10
 */
public interface Factory {
    Product getProduct();
}
