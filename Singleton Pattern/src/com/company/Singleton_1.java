package com.company;

public class Singleton_1 {

        private Singleton_1 ()
        {
            // private constructor
        }


        // Inner class to provide instance of class

        private static class BillPughSingleton
        {
            private static final Singleton_1 INSTANCE = new Singleton_1();
        }

        public static Singleton_1 getInstance()
        {
            return BillPughSingleton.INSTANCE;
        }

}


