
class DnDCharacter {

    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

    DnDCharacter() {
        strength = ability();
        dexterity = ability();
        constitution = ability();
        intelligence = ability();
        wisdom = ability();
        charisma = ability();
    }

    int ability() {
        int[] diceAttempt = new int[4];

        for (int i=0; i<diceAttempt.length; i++) {
            int dice = (int)((Math.random() * 6.0) + 1);
            diceAttempt[i] = dice;
        }

        int min = diceAttempt[0];
        int sum = 0;
        for (int i=0; i<diceAttempt.length; i++) {
            if (min > diceAttempt[i]) {
                min = diceAttempt[i];
            }
            sum += diceAttempt[i];
        }
        sum -= min;
        return sum;
    }

    int modifier(int input) {
        return Math.floorDiv(input-10, 2);
    }

    int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;

    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        int initialPoints = 10;
        return initialPoints + this.modifier(this.getConstitution());
    }
}
