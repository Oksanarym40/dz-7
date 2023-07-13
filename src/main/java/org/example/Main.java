package org.example;

public class Main {
    public enum SolarSystem {
        MERCURY(1, 0, 0, null),
        VENUS(2, 1, 40, MERCURY),
        EARTH(3, 2, 70, VENUS),
        MARS(4, 3, 110, EARTH),
        JUPITER(5, 4, 160, MARS),
        SATURN(6, 5, 220, JUPITER),
        URANUS(7, 6, 280, SATURN),
        NEPTUNE(8, 7, 350, URANUS),
        PLUTO(9, 8, 430, NEPTUNE);

        private int serialNumber;
        private int distanceFromPrevious;
        private int distanceFromSun;
        private int radius;
        private SolarSystem previousPlanet;
        private SolarSystem nextPlanet;

        SolarSystem(int serialNumber, int distanceFromPrevious, int distanceFromSun, SolarSystem previous) {
            this.serialNumber = serialNumber;
            this.distanceFromPrevious = distanceFromPrevious;
            if (previous != null) {
                this.distanceFromSun = previous.distanceFromSun + distanceFromSun;
                this.previousPlanet = previous;
                previous.nextPlanet = this;
            } else {
                this.distanceFromSun = distanceFromSun;
            }
            this.radius = distanceFromSun / 10;  
        }

        public int getSerialNumber() {
            return serialNumber;
        }

        public int getDistanceFromPrevious() {
            return distanceFromPrevious;
        }

        public int getDistanceFromSun() {
            return distanceFromSun;
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
}
