package strategy.impl;

import strategy.Plan;

/**
 * @author YaoS
 * @date 2019-05-23 10:43
 */
public class PlanA implements Plan {
    @Override
    public void run() {
        System.out.println("方案A,中午吃鸡");
    }
}
