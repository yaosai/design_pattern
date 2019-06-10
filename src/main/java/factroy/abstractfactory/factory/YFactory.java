package factroy.abstractfactory.factory;

import factroy.abstractfactory.materials.*;

/**
 * 抽象工厂
 *
 * @author YaoS
 * @date 2019-06-10 14:30
 */
public class YFactory implements AbstractFactory {
    @Override
    public MaterialA createMaterialA() {
        MaterialA materialA = new MaterialAY();
        System.out.println(materialA.getMaterial());
        return materialA;
    }

    @Override
    public MaterialB createMaterialB() {
        MaterialB materialB = new MaterialBY();
        System.out.println(materialB.getMaterial());
        return materialB;
    }
}
