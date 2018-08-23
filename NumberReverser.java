/**
 * Write a function that takes in an integer, and return an 
 * integer that the digits are in reverse order of the digits 
 * of input. e.g.:123 => 321
**/
public class NumberReverser {

	public int reverse(int input) {
		if (input == 0) {
			return 0;
		}
		int number = Math.abs(input);
		int signDigit = input < 0 ? -1 : 1;
		int digitCount = 1;
		int result = 0;
		while (number > 0) {
			digitCount = digitCount * 10;
			result = result * 10 + number%10;
			number = number / 10;
		}
		return result * signDigit;
	}
}
