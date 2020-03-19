class Acronym {
    private String[] words;

    Acronym(String phrase) {
        words = phrase.split("[^a-zA-Z0-9']+");
    }

    String get() {
        String initials = "";
        for (int i=0; i<words.length; i++) {
            initials += words[i].toUpperCase().charAt(0);
        }
        return initials;
    }
}
