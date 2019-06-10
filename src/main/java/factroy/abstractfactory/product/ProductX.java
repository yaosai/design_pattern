package factroy.abstractfactory.product;

import factroy.abstractfactory.factory.AbstractFactory;
import factroy.abstractfactory.factory.XFactory;

/**
 * 产品X
 *
 * @author YaoS
 * @date 2019-06-10 15:36
 */
public class ProductX extends Product {
    AbstractFactory factory;

    public ProductX() {
        this.factory = new XFactory();
    }

    @Override
    public void create() {
        materialA = factory.createMaterialA();
        materialB = factory.createMaterialB();
        System.out.println("生产X型产品，需要X型原材料");
    }
}
