package proxy;

import proxy.impl.ManRunner;
import proxy.impl.RunnerAgent;

/**
 * @author YaoS
 * @date 2019-05-23 10:18
 */
public class Main {
    public static void main(String[] args) {
        ManRunner runner = new ManRunner();
        Runner agent = new RunnerAgent(runner);
        agent.run();

    }
}
