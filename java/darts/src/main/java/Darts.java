class Darts {
    private double x;
    private double y;

    Darts(double x, double y) {
        this.x = x;
        this.y = y;
    }

    int score() {
        double position = Math.sqrt((x*x) + (y*y));

        if (position <= 1.0) {
            return 10;
        } else if (position <= 5.0) {
            return 5;
        } else if (position <= 10.0) {
            return 1;
        } else {
            return 0;
        }
    }

}
