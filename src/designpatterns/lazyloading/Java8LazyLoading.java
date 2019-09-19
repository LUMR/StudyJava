package designpatterns.lazyloading;

import java.util.function.Supplier;

/**
 * java8才有的懒加载方式
 *
 * @author lumr
 * @since 2019/9/19 下午9:56
 */
public class Java8LazyLoading {

    private Supplier<Heavy> heavy = this::createAndCacheHeavy;

    public Java8LazyLoading() {
        System.out.println("Java8Holder created");
    }

    public Heavy getHeavy() {
        return heavy.get();
    }

    private synchronized Heavy createAndCacheHeavy() {
        class HeavyFactory implements Supplier<Heavy> {
            private final Heavy heavyInstance = new Heavy();

            @Override
            public Heavy get() {
                return heavyInstance;
            }
        }
        if (!(heavy instanceof HeavyFactory)) {
            heavy = new HeavyFactory();
        }
        return heavy.get();
    }
}
