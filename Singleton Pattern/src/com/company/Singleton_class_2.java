package com.company;

public class Singleton_class_2 {

    //lazy initialization

    static  Singleton_class_2 obj ;

    private Singleton_class_2(){}


    // Not thread safe

    public Singleton_class_2 getInstance(){

        if (obj == null)
            obj = new Singleton_class_2();

        return obj;

    }
}
