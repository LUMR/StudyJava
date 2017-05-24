package com.lumr.concurrency.responsive;

/**
 * Created by lumr on 2017/5/24.
 */
public class ResponsiveUI extends Thread {
    private static volatile double d = 1;

    public ResponsiveUI() throws Exception{
        setDaemon(true);
        start();
    }

    public class UnresponsiveUI {
        private volatile double d = 1;

        public UnresponsiveUI() throws Exception {
            while (d>0){
                d = d+(Math.PI + Math.E)/d;
                System.in.read();
            }
        }
    }

    @Override
    public void run() {
        while (true) {
            d = d + (Math.PI+Math.E)/d;
        }
    }

    public static void main(String[] args) {
        //! new UnresponsiveUI();无限循环，不会进入下一行代码
        try {
            new ResponsiveUI();
            System.in.read();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(d);
    }
}
