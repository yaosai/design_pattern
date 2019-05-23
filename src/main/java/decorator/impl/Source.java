package decorator.impl;

import decorator.Sourcable;

/**
 * Sourcable实现
 *
 * @author YaoS
 * @date 2019-05-23 09:59
 */
public class Source implements Sourcable {

    @Override
    public void operation() {
        System.out.println("执行原始类方法");
    }
}
