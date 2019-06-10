package factroy.abstractfactory.product;

import factroy.abstractfactory.factory.AbstractFactory;
import factroy.abstractfactory.factory.YFactory;

/**
 * 产品Y
 *
 * @author YaoS
 * @date 2019-06-10 15:36
 */
public class ProductY extends Product {
    AbstractFactory factory;

    public ProductY() {
        this.factory = new YFactory();
    }

    @Override
    public void create() {
        materialA = factory.createMaterialA();
        materialB = factory.createMaterialB();
        System.out.println("生产Y型产品，需要Y型原材料");
    }
}
