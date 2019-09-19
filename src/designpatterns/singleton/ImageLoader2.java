package designpatterns.singleton;

/**
 * double checkLock
 * Created by work on 2018/3/14.
 * @deprecated 此模式有缺陷
 * @author lumr
 */
public class ImageLoader2 {
    private volatile static ImageLoader2 imageLoader;

    private ImageLoader2(){

    }

    public static ImageLoader2 get(){
        if (imageLoader != null)
            return imageLoader;

        synchronized (ImageLoader2.class){
            if (imageLoader != null)
                return imageLoader;
            imageLoader = new ImageLoader2();//不能保证指针赋值在类初始化后执行
            return imageLoader;
        }
    }
}
