package com.kate.module2.mod1;

public class Main {
    public static void main (String[] args) {
        Planet p1 = new Planet("uranus", PlanetType.GIANT);
        Planet p2 = new Planet("pluto", PlanetType.MESOPLANET);
        Planet p3 = new Planet("saturn", PlanetType.GIANT);

        System.out.println(p1.equals(p3));
        System.out.println(p2);
        System.out.println(p1.hashCode() == p3.hashCode());

    }
}
