package com.kate.module3.mod1;

public class fibonacciSequence {

    /**
     * @param n index of number in fibonacci sequence
     * @return value of number
     */
    public static int fibonacci(int n) {

        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }


    public static void main (String[] args) {
        System.out.println(fibonacci(9));
    }

}

