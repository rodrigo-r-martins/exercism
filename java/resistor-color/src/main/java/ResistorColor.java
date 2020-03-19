class ResistorColor {
    private String[] colorArr = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

    int colorCode(String color) {
        int code = 0;
        for (int i=0; i<colorArr.length; i++) {
            if (color.equalsIgnoreCase(colorArr[i])) {
                code = i;
            }
        }
        return code;
    }

    String[] colors() {
        return colorArr;
    }
}
