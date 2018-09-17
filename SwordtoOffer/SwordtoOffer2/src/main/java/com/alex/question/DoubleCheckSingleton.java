package com.alex.question;


/**
 * 单例模式 - 双重校验锁
 */
public class DoubleCheckSingleton {

    private static volatile DoubleCheckSingleton singleton;

    public synchronized static DoubleCheckSingleton getInstance(){
        if(singleton ==null){
            synchronized (DoubleCheckSingleton.class){
                if(singleton ==null){
                    singleton = new DoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }

}
