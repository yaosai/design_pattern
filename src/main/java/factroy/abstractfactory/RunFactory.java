package factroy.abstractfactory;

import factroy.abstractfactory.product.Product;
import factroy.abstractfactory.product.ProductX;
import factroy.abstractfactory.product.ProductY;
import factroy.abstractfactory.product.ProductZ;

/**
 * 生产产品
 *
 * @author YaoS
 * @date 2019-06-10 15:24
 */
public class RunFactory {
    /**
     * 需要什么类型的产品new就行了
     *
     * @author YaoS
     * @date 19/6/10 15:55
     */
    public static void main(String[] args) {
        Product productX = new ProductX();
        productX.create();
        Product productY = new ProductY();
        productY.create();
        Product productZ = new ProductZ();
        productZ.create();
    }
}
