package com.kate.module3.mod4;

import java.util.ArrayList;

public class PlayerSorter {

    public static int GAMESPLAYED = 1;
    public static int ATBATS = 2;
    public static int RUNS = 3;
    public static int PERCENTRUNS = 4; // Calculated by: runs/atBats
    public static int PERCENTONBASE = 5; // Calculated by (hits + doubles + triples) / atBats


    /**
     * This method is an interface that allows the sorting of a player given based on
     * certain criteria.  There are 5 options to sort a player which are by Games played,
     * at bats, runs, percent runs, percent on base.
     * The sort is in descending order (Largest to smallest)
     * This method calls one of 5 private methods that will do the sort based on the chosen criteria.
     *
     * @param list     List of players containing the statistics
     * @param sortType How the user wants the players sorted.  The value should be chosen from one of
     *                 the 5 static fields from the class.
     * @return An ArrayList that is sorted according to the user's specification.
     */
    public ArrayList<PlayerBattingStats> sort(ArrayList<PlayerBattingStats> list, int sortType) {
        //base case
        if (list.size() < 2) {
            return list;
        }

        //setup
        int midpoint = list.size() / 2;
        ArrayList<PlayerBattingStats> leftSide = new ArrayList<>() {{
            for (int i = 0; i < midpoint; i++) {
                add(list.get(i));
            }
        }};
        ArrayList<PlayerBattingStats> rightSide = new ArrayList<>() {{
            for (int i = midpoint; i < list.size(); i++) {
                add(list.get(i));
            }
        }};

        sort(leftSide, sortType);
        sort(rightSide, sortType);


        //merge
        switch (sortType) {
            case 1:
                mergeByGames(list, leftSide, rightSide);
                break;
            case 2:
                mergeByAtBats(list, leftSide, rightSide);
                break;
            case 3:
                mergeByRuns(list, leftSide, rightSide);
                break;
            case 4:
                mergeByPercentRuns(list, leftSide, rightSide);
                break;
            case 5:
                mergeByPercentOnBase(list, leftSide, rightSide);
                break;
            default:
                break;
        }

        return list;
    }


    /**
     * helper method: sort list by games descending
     * @param list list of players to be sorted
     * @param leftSide left half of list
     * @param rightSide right half of list
     */
    private static void mergeByGames(ArrayList<PlayerBattingStats> list, ArrayList<PlayerBattingStats> leftSide, ArrayList<PlayerBattingStats> rightSide) {
        int l = 0, r = 0, m = 0;

        while (l < leftSide.size() && r < rightSide.size()) {
            if (leftSide.get(l).getGames() > rightSide.get(r).getGames()) {
                list.set(m , leftSide.get(l));
                l++; m++;
            } else {
                list.set(m , rightSide.get(r));
                r++; m++;
            }
        }

        while (l < leftSide.size()) {
            list.set(m , leftSide.get(l));
            l++; m++;
        }

        while (r < rightSide.size()) {
            list.set(m , rightSide.get(r));
            r++; m++;
        }

    }

    /**
     * helper method: sort list by atBats descending
     * @param list list of players to be sorted
     * @param leftSide left half of list
     * @param rightSide right half of list
     */
    private static void mergeByAtBats(ArrayList<PlayerBattingStats> list, ArrayList<PlayerBattingStats> leftSide, ArrayList<PlayerBattingStats> rightSide) {
        int l = 0, r = 0, m = 0;

        while (l < leftSide.size() && r < rightSide.size()) {
            if (leftSide.get(l).getAtBats() > rightSide.get(r).getAtBats()) {
                list.set(m , leftSide.get(l));
                l++; m++;
            } else {
                list.set(m , rightSide.get(r));
                r++; m++;
            }
        }

        while (l < leftSide.size()) {
            list.set(m , leftSide.get(l));
            l++; m++;
        }

        while (r < rightSide.size()) {
            list.set(m , rightSide.get(r));
            r++; m++;
        }

    }

    /**
     * helper method: sort list by runs descending
     * @param list list of players to be sorted
     * @param leftSide left half of list
     * @param rightSide right half of list
     */
    private static void mergeByRuns(ArrayList<PlayerBattingStats> list, ArrayList<PlayerBattingStats> leftSide, ArrayList<PlayerBattingStats> rightSide) {
        int l = 0, r = 0, m = 0;

        while (l < leftSide.size() && r < rightSide.size()) {
            if (leftSide.get(l).getRuns() > rightSide.get(r).getRuns()) {
                list.set(m , leftSide.get(l));
                l++; m++;
            } else {
                list.set(m , rightSide.get(r));
                r++; m++;
            }
        }

        while (l < leftSide.size()) {
            list.set(m , leftSide.get(l));
            l++; m++;
        }

        while (r < rightSide.size()) {
            list.set(m , rightSide.get(r));
            r++; m++;
        }

    }
    /**
     * helper method: sort list by percentRuns descending
     * @param list list of players to be sorted
     * @param leftSide left half of list
     * @param rightSide right half of list
     */
    private static void mergeByPercentRuns(ArrayList<PlayerBattingStats> list, ArrayList<PlayerBattingStats> leftSide, ArrayList<PlayerBattingStats> rightSide) {
        int l = 0, r = 0, m = 0;

        while (l < leftSide.size() && r < rightSide.size()) {
            if (leftSide.get(l).getPercentRuns() > rightSide.get(r).getPercentRuns()) {
                list.set(m , leftSide.get(l));
                l++; m++;
            } else {
                list.set(m , rightSide.get(r));
                r++; m++;
            }
        }

        while (l < leftSide.size()) {
            list.set(m , leftSide.get(l));
            l++; m++;
        }

        while (r < rightSide.size()) {
            list.set(m , rightSide.get(r));
            r++; m++;
        }
    }
    /**
     * helper method: sort list by percentOnBase descending
     * @param list list of players to be sorted
     * @param leftSide left half of list
     * @param rightSide right half of list
     */
    private static void mergeByPercentOnBase(ArrayList<PlayerBattingStats> list, ArrayList<PlayerBattingStats> leftSide, ArrayList<PlayerBattingStats> rightSide) {
        int l = 0, r = 0, m = 0;

        while (l < leftSide.size() && r < rightSide.size()) {
            if (leftSide.get(l).getPercentOnBase() > rightSide.get(r).getPercentOnBase()) {
                list.set(m , leftSide.get(l));
                l++; m++;
            } else {
                list.set(m , rightSide.get(r));
                r++; m++;
            }
        }

        while (l < leftSide.size()) {
            list.set(m , leftSide.get(l));
            l++; m++;
        }

        while (r < rightSide.size()) {
            list.set(m , rightSide.get(r));
            r++; m++;
        }
    }
}
