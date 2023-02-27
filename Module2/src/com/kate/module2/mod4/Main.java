package com.kate.module2.mod4;

import java.io.*;
import java.util.*;

public class Main {

    public static void main (String[] args) {

        Set<String> uniqueWords = new HashSet<>();
        File file = new File("Module2/src/com/kate/module2/mod4/illiad.txt");
        Scanner scanner = new Scanner("");
            try {
                scanner = new Scanner(file);
            } catch (java.io.FileNotFoundException e) {
                System.err.println(e.getMessage());
            }


        while (scanner.hasNext()) {
            Word word = new Word(scanner.next());
            uniqueWords.add(word.actualWord);
        }

        System.out.print(uniqueWords.size());

    }
}
