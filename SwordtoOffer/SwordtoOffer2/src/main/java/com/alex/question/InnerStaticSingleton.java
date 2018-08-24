package com.alex.question;

public class InnerStaticSingleton {

    private static class InnerStaticSingletonMaker {
        private static InnerStaticSingleton innerStaticSingleton = new InnerStaticSingleton();
    }

    public InnerStaticSingleton getInstance(){
        return InnerStaticSingletonMaker.innerStaticSingleton;
    }

}
