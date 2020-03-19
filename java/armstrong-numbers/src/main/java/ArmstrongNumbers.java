
class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {
		int numLen = Integer.toString(numberToCheck).length();
		int result = 0;
		int splitNum = numberToCheck;

		for (int i=0; i<numLen; i++) {
			result += Math.pow(splitNum % 10, numLen);
			splitNum = splitNum / 10;
		}
		return result == numberToCheck;
	}
}
