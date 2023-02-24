package com.kate.module2.mod5;

import java.util.HashMap;

public class Main {


    public static void main (String[] args) {

    caesarCipher caesarCipher = new caesarCipher("te st");
    System.out.println(caesarCipher.input.charAt(0));
    System.out.println(caesarCipher.alphabet.get(0));
    System.out.println(caesarCipher.encode(0));

        }

    }





//    Using Maps create a class that allows someone
//     to instantiate with a number between 1 and 25 representing the number of shifts.  Have 2
//     methods one that encrypts a message from their chosen shift and one that decrypts from chosen
//       shift.

