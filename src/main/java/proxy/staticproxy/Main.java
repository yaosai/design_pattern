package proxy.staticproxy;

import proxy.staticproxy.impl.ManRunner;
import proxy.staticproxy.impl.RunnerAgent;

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
