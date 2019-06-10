package factroy.abstractfactory.product;

import factroy.abstractfactory.factory.AbstractFactory;
import factroy.abstractfactory.factory.XFactory;
import factroy.abstractfactory.factory.YFactory;

/**
 * 特殊产品Z：由工厂X提供材料A,工厂Y提供材料B
 *
 * @author YaoS
 * @date 2019-06-10 15:36
 */
public class ProductZ extends Product {
    AbstractFactory factoryX;
    AbstractFactory factoryY;

    public ProductZ() {
        this.factoryX = new XFactory();
        this.factoryY = new YFactory();
    }

    @Override
    public void create() {
        materialA = factoryX.createMaterialA();
        materialB = factoryY.createMaterialB();
        System.out.println("生产Z型产品，需要X型原材料A,Y型原材料B");
    }
}
