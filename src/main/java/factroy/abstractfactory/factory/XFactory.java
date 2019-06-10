package factroy.abstractfactory.factory;

import factroy.abstractfactory.materials.MaterialA;
import factroy.abstractfactory.materials.MaterialAX;
import factroy.abstractfactory.materials.MaterialB;
import factroy.abstractfactory.materials.MaterialBX;

/**
 * 抽象工厂
 *
 * @author YaoS
 * @date 2019-06-10 14:30
 */
public class XFactory implements AbstractFactory {
    @Override
    public MaterialA createMaterialA() {
        MaterialA materialA = new MaterialAX();
        System.out.println(materialA.getMaterial());
        return materialA;
    }

    @Override
    public MaterialB createMaterialB() {
        MaterialB materialB = new MaterialBX();
        System.out.println(materialB.getMaterial());
        return materialB;
    }
}
