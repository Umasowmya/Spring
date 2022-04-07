package com.company;

public class Thread_safe_singleton {

    //lazy initialization

    static  Thread_safe_singleton obj ;

    private Thread_safe_singleton (){}


    // thread safe but poor performance

    public synchronized Thread_safe_singleton getInstance() {

        if (obj == null)
            obj = new Thread_safe_singleton();

        return obj;
    }

}
