package designpatterns.singleton;

/**
 * 单例模式
 * 静态内部类实现模式
 * Created by work on 2018/3/14.
 *
 * @author lumr
 */
public class ImageLoader {
    private static class InnerInstance{
        private static final ImageLoader instance = new ImageLoader();
    }

    public static ImageLoader get(){
        return InnerInstance.instance;
    }
}
