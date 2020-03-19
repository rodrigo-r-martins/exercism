
class SpaceAge {
    private double seconds;
    private double orbit;
    private final double EARTH_SECONDS = 365.25 * 24 * 60 * 60;

    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return seconds;
    }

    double onEarth() {
        return seconds / EARTH_SECONDS;
    }

    double onMercury() {
        orbit = 0.2408467;
        return seconds / (EARTH_SECONDS*orbit);
    }

    double onVenus() {
        orbit = 0.61519726;
        return seconds / (EARTH_SECONDS*orbit);
    }

    double onMars() {
        orbit = 1.8808158;
        return seconds / (EARTH_SECONDS*orbit);
    }

    double onJupiter() {
        orbit = 11.862615;
        return seconds / (EARTH_SECONDS*orbit);
    }

    double onSaturn() {
        orbit = 29.447498;
        return seconds / (EARTH_SECONDS*orbit);
    }

    double onUranus() {
        orbit = 84.016846;
        return seconds / (EARTH_SECONDS*orbit);
    }

    double onNeptune() {
        orbit = 164.79132;
        return seconds / (EARTH_SECONDS*orbit);
    }
}
