class ResistorColorDuo {
    private String[] colorArr = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

    int value(String[] colors) {
        String code = "";
        for (int i=0; i<2; i++) {
            for (int j=0; j<colorArr.length; j++) {
                if (colors[i].equalsIgnoreCase(colorArr[j])) {
                    code += j;
                }
            }
        }
        return Integer.parseInt(code);
    }
}
