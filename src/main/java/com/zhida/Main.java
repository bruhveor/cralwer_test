package com.zhida;

/**
 * Created by Administrator on 2017-04-05.
 */
public class Main {


    public static void main(String[] args) {
        Spider spiderTest = new Spider();
        spiderTest.init();
        while (true) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
