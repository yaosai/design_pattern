package factroy.abstractfactory.factory;

import factroy.abstractfactory.materials.MaterialA;
import factroy.abstractfactory.materials.MaterialB;

/**
 * 抽象工厂
 *
 * @author YaoS
 * @date 2019-06-10 14:30
 */
public interface AbstractFactory {
    MaterialA createMaterialA();

    MaterialB createMaterialB();
}
