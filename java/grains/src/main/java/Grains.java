import java.math.BigInteger;

class Grains {

    private BigInteger one = new BigInteger("1");
    private BigInteger two = new BigInteger("2");

    BigInteger grainsOnSquare(final int square) {

        if (square <= 0 || square > 64) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }

        return  two.pow(square-1);
    }

    BigInteger grainsOnBoard() {
        return two.pow(64).subtract(one);
    }

}
