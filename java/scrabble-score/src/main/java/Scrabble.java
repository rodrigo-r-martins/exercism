class Scrabble {

    String word = "";
    char[] letters = new char[word.length()];
    
    Scrabble(String word) {
        this.word = word;
        this.letters = word.toUpperCase().toCharArray();        
    }

    int getScore() {
        int score = 0;
        for(int i=0; i<letters.length; i++) {
            switch(letters[i]) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'L':
                case 'N':
                case 'R':
                case 'S':
                case 'T':
                    score += 1;
                    break;
                case 'D':
                case 'G':
                    score += 2;
                    break;
                case 'B':
                case 'C':
                case 'M':
                case 'P':
                    score += 3;
                    break;
                case 'F':
                case 'H':
                case 'V':
                case 'W':
                case 'Y':
                    score += 4;
                    break;
                case 'K':
                    score += 5;
                    break;
                case 'J':
                case 'X':
                    score += 8;
                    break;
                case 'Q':
                case 'Z':
                    score += 10;
                    break;
                default:
                    break;
            }
        }
        return score;    
    }

}
