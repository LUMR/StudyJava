package com.lumr.single;

/**
 * double checkLock
 * Created by work on 2018/3/14.
 *
 * @author lumr
 */
public class ImageLoader2 {
    private static ImageLoader2 imageLoader;

    private ImageLoader2(){

    }

    public static ImageLoader2 get(){
        if (imageLoader != null)
            return imageLoader;

        synchronized (ImageLoader2.class){
            if (imageLoader != null)
                return imageLoader;
            imageLoader = new ImageLoader2();
            return imageLoader;
        }
    }
}
