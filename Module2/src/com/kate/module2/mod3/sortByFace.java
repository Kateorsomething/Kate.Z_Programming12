package com.kate.module2.mod3;

import java.util.Comparator;

public class sortByFace implements Comparator<cards> {

    //sorts by notFace -> face
    @Override
    public int compare(cards o1, cards o2) {
        if (o1.isFaceCard) {
            if (o2.isFaceCard) {
                return 0;
            } else {
                return 1;
            }
        } else {
            if (o2.isFaceCard) {
                return -1;
            } else {
                return 0;
            }
        }
    }

}
