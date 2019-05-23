package strategy;

/**
 * 方案执行者
 *
 * @author YaoS
 * @date 2019-05-23 10:48
 */
public class Person {
    private Plan plan;

    public void exec(Plan plan) {
        System.out.println("方案执行者执行方案……");
        plan.run();
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }
}
