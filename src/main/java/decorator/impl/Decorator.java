package decorator.impl;

import decorator.Sourcable;

/**
 * 装饰器类
 *
 * @author YaoS
 * @date 2019-05-23 10:00
 */
public class Decorator implements Sourcable {

    private Sourcable sourcable;

    public Decorator(Sourcable sourcable) {
        super();
        this.sourcable = sourcable;
    }

    @Override
    public void operation() {
        System.out.println("装饰器在方法之前");
        sourcable.operation();
        System.out.println("装饰器在方法之后");

    }
}
