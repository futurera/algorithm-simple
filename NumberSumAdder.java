public class NumberSumAdder {

	public int sumDigits(int number) {
		if (Math.abs(number) >= 0 && Math.abs(number) < 10) {
			return Math.abs(number);
		}
		while (number > 9) {
			int numberHolder = number;
			int digitCount = 1;
			int sum = 0;
			while (numberHolder > 0) {
				digitCount = digitCount * 10;
				sum += numberHolder%10;
				numberHolder = numberHolder/10;
			}
			number = sum;
		}
		return number;
	}
}
