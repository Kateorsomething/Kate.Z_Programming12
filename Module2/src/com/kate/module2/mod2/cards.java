package com.kate.module2.mod2;

public class cards implements Comparable<cards>{
    int value;
    Suits suits;
    boolean isFaceCard;

    public cards(int value, Suits suits) {
        this.value = value;
        this.suits = suits;
        if (value > 10) {
            this.isFaceCard = true;
        } else {
            this.isFaceCard = false;
        }
    }

    public String toString() {
        return value + " of " + suits.suit;
    }


    @Override
    public int compareTo(cards o) {
        return this.value - o.value;
    }
}