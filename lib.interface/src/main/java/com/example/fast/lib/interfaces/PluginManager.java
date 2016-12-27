package com.example.fast.lib.interfaces;

/**
 * Created by bingbing on 2016/12/21.
 */

public class PluginManager {

    IOne one;

    ITwo two;

    private static PluginManager mInstance;

    public PluginManager() {
        try {
            one = getImpl("com.example.fast.impl.OneImpl");
            two = getImpl("com.example.fast.impl.TwoImpl");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private <T> T getImpl(String className) {
        try {
            Class<?> clazz = Class.forName(className);
            return (T) clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public static PluginManager getInstance() {
        if (mInstance == null) {
            synchronized (PluginManager.class) {
                if (mInstance == null) {
                    mInstance = new PluginManager();
                }
            }
        }
        return mInstance;
    }

    public static IOne getOne() {
        return getInstance().one;
    }

    public static ITwo getTwo() {
        return getInstance().two;
    }

}
