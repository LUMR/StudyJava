package designpatterns.singleton;

/**
 * @author lumr
 * @since 2019/9/19 下午9:49
 */
public class ImageLoader3 {
    //加上volatile可以保证可见性不会有ImageLoader2的问题
    private volatile static ImageLoader3 imageLoader;

    private ImageLoader3(){

    }

    public static ImageLoader3 get(){
        if (imageLoader != null)
            return imageLoader;

        synchronized (ImageLoader3.class){
            if (imageLoader != null)
                return imageLoader;
            imageLoader = new ImageLoader3();//不能保证指针赋值在类初始化后执行
            return imageLoader;
        }
    }
}
