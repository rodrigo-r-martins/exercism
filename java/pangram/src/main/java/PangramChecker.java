public class PangramChecker {

    public boolean isPangram(String input) {
        String ascii[] = {
                "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l","m",
                "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"
        };
        boolean itIs = true;

        for (int i=0; i<ascii.length; i++) {
            if (!input.toLowerCase().contains(ascii[i])) {
                itIs = false;
            }
        }
        return itIs;
    }

}
