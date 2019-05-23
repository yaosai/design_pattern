package strategy;

import strategy.impl.PlanA;
import strategy.impl.PlanB;

/**
 * 策略模式，执行者根据可根据不同情况执行不同策略
 *
 * @author YaoS
 * @date 2019-05-23 10:41
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("中午吃什么？");
        Plan planA = new PlanA();
        Plan planB = new PlanB();
        Person person = new Person();
        //策略执行者执行策略
        person.exec(planA);
        person.exec(planB);
    }
}
