import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        List<Signal> result = new ArrayList<Signal>();
        String numByBinary = Integer.toBinaryString(number);

        if (number == 0) {
            return result;
        }

        if (numByBinary.length() >= 1 && numByBinary.charAt(numByBinary.length() - 1) == '1') {
            result.add(Signal.WINK);
        }
        if (numByBinary.length() >= 2 && numByBinary.charAt(numByBinary.length() - 2) == '1') {
            result.add(Signal.DOUBLE_BLINK);
        }
        if (numByBinary.length() >= 3 && numByBinary.charAt(numByBinary.length() - 3) == '1') {
            result.add(Signal.CLOSE_YOUR_EYES);
        }
        if (numByBinary.length() >= 4 && numByBinary.charAt(numByBinary.length() - 4) == '1') {
            result.add(Signal.JUMP);
        }

        if (numByBinary.length() > 4) {
            Collections.reverse(result);
        }

        return result;
    }

}
