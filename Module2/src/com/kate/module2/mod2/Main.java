package com.kate.module2.mod2;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        LinkedList<cards> deckOfCards = new LinkedList<>();

        for (int i = 1; i < 14; i++) {
            deckOfCards.add(new cards(i, Suits.SPADES));
            deckOfCards.add(new cards(i, Suits.HEARTS));
            deckOfCards.add(new cards(i, Suits.DIAMONDS));
            deckOfCards.add(new cards(i, Suits.CLUBS));
        }


        List<cards> secondDeck = new LinkedList<>();
        for (int i = 0; i < 6; i++) {
            secondDeck.add(deckOfCards.pollLast());
        }

        for (cards c : secondDeck) {
            System.out.println(c);
        }

    }
}

