package strategy.impl;

import strategy.Plan;

/**
 * @author YaoS
 * @date 2019-05-23 10:46
 */
public class PlanB implements Plan {
    @Override
    public void run() {
        System.out.println("方案B,中午吃鸭");
    }
}
