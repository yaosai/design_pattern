package decorator;

import decorator.impl.Decorator;
import decorator.impl.Source;

/**
 * @author YaoS
 * @date 2019-05-23 10:03
 */
public class Main {
    public static void main(String[] args) {
        Sourcable source = new Source();
        //使用装饰器修饰原始类
        Sourcable obj = new Decorator(source);
        obj.operation();
    }
}
