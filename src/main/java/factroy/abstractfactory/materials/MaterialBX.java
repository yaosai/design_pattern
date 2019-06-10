package factroy.abstractfactory.materials;

/**
 * 原材料B的X型
 *
 * @author YaoS
 * @date 2019-06-10 15:16
 */
public class MaterialBX implements MaterialB {
    @Override
    public String getMaterial() {
        return "获取X型原材料B";
    }
}
