package proxy.impl;

import proxy.Runner;

import java.util.Random;

/**
 * @author YaoS
 * @date 2019-05-23 10:17
 */
public class RunnerAgent implements Runner {
    private Runner runner;

    public RunnerAgent(Runner runner) {
        this.runner = runner;
    }

    /**
     * 代理模式中，代理类对被代理的对象有控制权，决定其执行或者不执行。
     *
     * @author YaoS
     * @date 19/5/23 10:22
     */
    @Override
    public void run() {
        Random rand = new Random();
        if (rand.nextBoolean()) {
            System.out.println("代理人安排运动员跑步...");
            runner.run();
        } else {
            System.out.println("代理人有事情，不安排运动员跑步了...");
        }
    }
}
