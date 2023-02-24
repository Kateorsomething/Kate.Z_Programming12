package com.kate.module2.mod1;

public class Planet {
    private String designation;
    private double massKg;
    private double orbitEarthYears;
    private PlanetType type;


    public Planet(String designation, PlanetType type){
        this.designation = designation;
        this.type = type;
    }

    public Planet(String designation, double massKg, double orbitEarthYears, PlanetType type) {
        this.designation = designation;
        this.massKg = massKg;
        this.orbitEarthYears = orbitEarthYears;
        this.type = type;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Planet) {
            Planet p = (Planet)obj;
            return this.designation == p.designation;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "hashcode: " + this.hashCode() + ". designation: " + this.designation + ". type: " + this.type + ".";
    }
}
