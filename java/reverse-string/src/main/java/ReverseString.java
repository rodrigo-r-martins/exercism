class ReverseString {

    String reverse(String inputString) {
        char[] charStr = inputString.toCharArray();
        String wordRev = "";
        for (int i=charStr.length-1; i>=0; i--) {
            wordRev += charStr[i];
        }
        return wordRev;
    }
}