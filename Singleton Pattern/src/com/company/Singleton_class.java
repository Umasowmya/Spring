package com.company;

public class Singleton_class {


    //early initialization

    //allocates memory for object even not required

    static  Singleton_class obj = new Singleton_class();

    private Singleton_class(){}



    public Singleton_class getInstance(){
        return obj;
    }

}
