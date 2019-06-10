package factroy.abstractfactory;

/**
 * 简单工厂模式的调用类
 *
 * @author YaoS
 * @date 2019-06-10 13:57
 */
public class AbstractFactory {

    /**
     * 简单工厂反射调用
     *
     * @param c 对象类型
     * @return Project
     * @author YaoS
     * @date 19/6/10 13:59
     */
    private static Project runProject(Class c) {
        Project project = null;
        try {
            project = (Project) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return project;
    }

    /**
     * 只需往工厂中传入对象的类型，即可实现对其功能的调用
     *
     * @author YaoS
     * @date 19/6/10 13:59
     */
    public static void main(String[] args) {
        Project projectA = AbstractFactory.runProject(ProjectA.class);
        projectA.run();
        Project projectB = AbstractFactory.runProject(ProjectB.class);
        projectB.run();
    }
}
