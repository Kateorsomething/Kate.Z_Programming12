package com.kate.module2.mod3;

import java.util.*;

public class sortBySuits implements Comparator<cards> {

    //sorts by spades -> hearts -> diamonds -> clubs

    @Override
    public int compare(cards o1, cards o2) {
        return o1.suits.order - o2.suits.order;
    }

}
