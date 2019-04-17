package com.geely.design.pattern.creational.singleton;

import java.io.Serializable;

/**
 * Created by geely
 * <p>
 * 优点：
 * (1)写法简单；
 * (2)类加载的时候就进行了初始化,避免了线程同步的问题
 * 缺点：
 * (1)没有延迟初始化，可能造成内存浪费
 *
 */
public class HungrySingleton implements Serializable, Cloneable {

//    private final static HungrySingleton hungrySingleton = new HungrySingleton();

    private final static HungrySingleton hungrySingleton;

    static {
        hungrySingleton = new HungrySingleton();
    }

    /**
     * 防止反射破坏单例模式
     */
    private HungrySingleton() {
        if (hungrySingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    /**
     * 防止序列化过程造成单例破坏
     */
    private Object readResolve() {
        return hungrySingleton;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return getInstance();
    }
}
