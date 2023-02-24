package com.kate.module2.mod5;

import java.util.*;

public class caesarCipher {

    public int key;
    public String input;

    public HashMap<Integer,String> alphabet = new HashMap<>(){{
        put(0," ");
        for (int i = 0;i < 26 ; i ++) {
            char[] a = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
            put(i+1, String.valueOf(a[i]));
        }
    }};

    caesarCipher(String input) {
        this.input = input;
    }


    public LinkedList<Integer> encode(int key) {

//1.take input(String) - > return numbers(String)
        LinkedList<Integer> stringInNum = new LinkedList<>();
        for (int i = 0; i < this.input.length(); i++) {
            if (Character.isWhitespace(this.input.charAt(i))) {
                stringInNum.add(0);
            } else {
                //add the corresponding number
                for (Map.Entry<Integer, String> entry : alphabet.entrySet()) {
                    if (Character.valueOf(this.input.charAt(i)).equals(entry.getValue())) {
                        stringInNum.add(entry.getKey());
                    }
                }
            }
        }


        // 2.return shifted #
        Iterator iterator = stringInNum.iterator();
        LinkedList<Integer> shiftedStringInNum = new LinkedList<>();

        while (iterator.hasNext()) {
            shiftedStringInNum.add(((int)iterator.next() + key) % 26);
        }
// 3. convert # back to string and return

        return shiftedStringInNum;
    }




public String decode() {
    return("");
}



}







