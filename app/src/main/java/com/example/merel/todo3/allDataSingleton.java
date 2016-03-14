package com.example.merel.todo3;

/**
 * Created by Merel on 07/03/2016.
 */
public class allDataSingleton {
    private static allDataSingleton ourInstance = new allDataSingleton();

    public static allDataSingleton getInstance() {
        return ourInstance;
    }

    private allDataSingleton() {
    }
}
