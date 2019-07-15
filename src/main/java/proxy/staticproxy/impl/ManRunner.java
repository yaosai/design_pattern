package proxy.staticproxy.impl;

import proxy.staticproxy.Runner;

/**
 * @author YaoS
 * @date 2019-05-23 10:16
 */
public class ManRunner implements Runner {
    @Override
    public void run() {
        System.out.println("执行原始类方法");
    }
}
