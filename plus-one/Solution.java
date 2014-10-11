public class Solution {
	public int[] plusOne(int[] digits) {
		// carry analysis
		int carry = 1;
		for (int i = digits.length - 1; i >= 0; i--) {
			carry = (digits[i] + carry) / 10;
		}
		// addition
		int[] result;
		if (carry == 1) {
			result = new int[digits.length + 1];
		} else {
			result = new int[digits.length];
		}
		carry = 1;
		for (int i = digits.length - 1; i >= 0; i--) {
			int sum = digits[i] + carry;
			result[result.length - digits.length + i] = sum % 10;
			carry = sum / 10;
		}
		
		if (carry == 1) {
			result[0] = 1;
		}
		return result;
	}
}