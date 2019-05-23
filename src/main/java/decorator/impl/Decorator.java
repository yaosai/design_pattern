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

    /**
     * 装饰模式中，装饰类对代理对象没有控制权，只能为其增加一层装饰，以加强被装饰对象的功能。
     *
     * @author YaoS
     * @date 19/5/23 10:23
     */
    @Override
    public void operation() {
        System.out.println("在方法之前执行装饰器");
        sourcable.operation();
        System.out.println("在方法之后执行装饰器");

    }
}
