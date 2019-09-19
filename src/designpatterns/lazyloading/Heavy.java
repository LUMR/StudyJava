package designpatterns.lazyloading;

/**
 * @author lumr
 * @since 2019/9/19 下午9:57
 */
public class Heavy {

    public Heavy() {
        try {
            System.out.println("Create Heavy");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("complete Heavy");
    }
}
