package com.kate.module2.mod5;

public class Main {

    public static void main (String[] args) {

    caesarCipher caesarCipher = new caesarCipher("te st");
    caesarCipher message = new caesarCipher(caesarCipher.encode(2));



        System.out.println(caesarCipher.encode(2));
        System.out.println(message.decode(2));
    }

}

