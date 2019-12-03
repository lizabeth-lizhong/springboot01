package com.example.springboot01;

public class HungrySingleton {
    private HungrySingleton(){

        // private 保证不能从外部直接new一个对象出来

    }


    public static void main(String[] args) {
        HungrySingleton h = new HungrySingleton();
        boolean b = h instanceof HungrySingleton;

    }

}

