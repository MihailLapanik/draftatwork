package com.company;

public class Main {

    public static void main(String[] args) {
        int X=4;
        System.out.println(factorial(X));
    }
        static int factorial( int x){

            if (x == 1) {

                return 1;
            }
            return x + factorial(x - 1);
        }
    }



