package com.kate.module2.mod5;

import java.util.*;
import java.lang.*;

public class caesarCipher {

    public String input;

    public final HashMap<Integer, Character> alphabet = new HashMap<>() {{
        put(0, ' ');
        for (int i = 0; i < 26; i++) {
            char[] a = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
            put(i + 1, a[i]);
        }
    }};


    caesarCipher(String input) {
        this.input = input;
    }


    /**
     * @param key
     * @return coded message in String
     */

    public String encode(int key) {

        char[] stringInArray = this.input.toCharArray();

        LinkedList<Integer> stringInNum = new LinkedList<>();
        for (int i = 0; i < stringInArray.length; i++) {
            if (Character.isWhitespace(stringInArray[i])) {
                stringInNum.add(0);
            } else {
                for (Map.Entry<Integer, Character> entry : alphabet.entrySet()) {
                    if (Objects.equals(stringInArray[i], entry.getValue())) {
                        stringInNum.add(entry.getKey());
                    }
                }
            }
        }

        for (int i = 0 ; i < stringInNum.size() ; i ++) {
             if (stringInNum.get(i) == 0) {
                 continue;
             } else {
                 stringInNum.set(i, (stringInNum.get(i) + key) % 26);
             }
        }

        String encoded = "";
        for (Integer i : stringInNum) {
            encoded = encoded + alphabet.get(i);
        }
        return encoded;
    }


    /**
     * @param key
     * @return decoded message in String
     */
    public String decode(int key) {

        char[] stringInArray = this.input.toCharArray();

        LinkedList<Integer> stringInNum = new LinkedList<>();
        for (int i = 0; i < stringInArray.length; i++) {
            if (Character.isWhitespace(stringInArray[i])) {
                stringInNum.add(0);
            } else {
                for (Map.Entry<Integer, Character> entry : alphabet.entrySet()) {
                    if (Objects.equals(stringInArray[i], entry.getValue())) {
                        stringInNum.add(entry.getKey());
                    }
                }
            }
        }

        for (int i = 0 ; i < stringInNum.size() ; i ++) {
            if (stringInNum.get(i) == 0) {
                continue;
            } else {
                stringInNum.set(i, (stringInNum.get(i) - key) % 26);
            }
        }

        String encoded = "";
        for (Integer i : stringInNum) {
            encoded = encoded + alphabet.get(i);
        }
        return encoded;
    }

}









