package com.kate.module2.mod4;

import java.io.*;
import java.util.*;


public class Word {
    String actualWord;

    public Word(String word) {
        this.actualWord = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }


}



