class RnaTranscription {

    String transcribe(String dnaStrand) {
        int numOfStrands = dnaStrand.length();
        char[] dna = {'A', 'C', 'G', 'T'};
        String rnaStr = "";

        if (numOfStrands == 0) {
            rnaStr = "";
        } else {
            for (int i=0; i<dnaStrand.length(); i++) {
                if (dnaStrand.split("")[i].equalsIgnoreCase("G")) {
                    rnaStr += "C";
                } else if (dnaStrand.split("")[i].equalsIgnoreCase("C")) {
                    rnaStr += "G";
                } else if (dnaStrand.split("")[i].equalsIgnoreCase("T")) {
                    rnaStr += "A";
                } else if (dnaStrand.split("")[i].equalsIgnoreCase("A")) {
                    rnaStr += "U";
                }
            }
        }
        return rnaStr;
    }

}
