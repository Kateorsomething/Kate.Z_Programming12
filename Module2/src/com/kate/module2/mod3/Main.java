package com.kate.module2.mod3;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        LinkedList<cards> deckOfCards = new LinkedList<>() {{
                for (int i = 1; i < 14; i++) {
                    add(new cards(i, Suits.SPADES));
                    add(new cards(i, Suits.HEARTS));
                    add(new cards(i, Suits.DIAMONDS));
                    add(new cards(i, Suits.CLUBS));
                }
            }};

        System.out.println("-----------Sorted by suits------------");

        sortBySuits s = new sortBySuits();
        Collections.sort(deckOfCards,s);

        for (cards c : deckOfCards) {
            System.out.println(c);
        }

        System.out.println("-----------Sorted by face------------");

        sortByFace f = new sortByFace();
        Collections.sort(deckOfCards,f);

        for (cards c : deckOfCards) {
            System.out.println(c);
        }

    }
}
