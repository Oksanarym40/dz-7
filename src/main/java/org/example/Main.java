package org.example;

public enum SolarSystem {
    MERCURY(0, 0, null),
    VENUS(1, 40, MERCURY),
    EARTH(2, 70, VENUS),
    MARS(3, 110, EARTH),
    JUPITER(4, 160, MARS),
    SATURN(5, 220, JUPITER),
    URANUS(6, 280, SATURN),
    NEPTUNE(7, 350, URANUS),
    PLUTO(8, 430, NEPTUNE);

    private int distanceFromPrevious;
    private int radius;
    private SolarSystem previousPlanet;
    private SolarSystem nextPlanet;

    SolarSystem(int distanceFromPrevious, SolarSystem previous) {
        this.distanceFromPrevious = distanceFromPrevious;
        if (previous != null) {
            this.previousPlanet = previous;
            previous.nextPlanet = this;
        }
        this.radius = distanceFromPrevious / 10;  // Just an example calculation for radius based on distance
    }

    public int getDistanceFromPrevious() {
        return distanceFromPrevious;
    }

    public int getRadius() {
        return radius;
    }

    public SolarSystem getPreviousPlanet() {
        return previousPlanet;
    }

    public SolarSystem getNextPlanet() {
        return nextPlanet;
    }
}






