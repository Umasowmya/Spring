package com.company;

public class Double_check_Locking {


    static  Double_check_Locking obj = null ;

    private Double_check_Locking (){}


    // thread safe and efficient

    public static  Double_check_Locking getInstance()
    {
        if (obj == null)
        {
            synchronized (Double_check_Locking.class)
            {

                if (obj==null)
                    obj = new Double_check_Locking();
            }
        }
        return obj;
    }
}
