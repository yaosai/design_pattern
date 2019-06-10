package factroy.abstractfactory.product;

import factroy.abstractfactory.materials.MaterialA;
import factroy.abstractfactory.materials.MaterialB;

/**
 * 抽象产品
 *
 * @author YaoS
 * @date 2019-06-10 14:30
 */
public abstract class Product {
    public MaterialA materialA;
    public MaterialB materialB;

    public abstract void create();
}
