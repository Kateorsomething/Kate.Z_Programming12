package com.kate.module2.mod3;

public enum Suits {
    SPADES("spades",1),
    HEARTS("hearts",2),
    DIAMONDS("diamonds",3),

    CLUBS("clubs",4);

    public String suit;
    public int order;

    Suits(String suit,int order) {
        this.suit = suit;
        this.order = order;
    }

}
