package factroy.abstractfactory.materials;

/**
 * 原材料A的X型
 *
 * @author YaoS
 * @date 2019-06-10 15:16
 */
public class MaterialAX implements MaterialA {
    @Override
    public String getMaterial() {
        return "获取X型原材料A";
    }
}
