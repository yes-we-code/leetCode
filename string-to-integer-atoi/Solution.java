public class Solution {
	public int atoi(String str) {
		str = str.trim();
		if (str.isEmpty()) {
			return 0;
		}
		int val = 0;
		int sign = 1;
		int index = 0;
		if (str.charAt(0) == '-') {
			sign = -1;
			index++;
		} else if (str.charAt(0) == '+') {
			index++;
		}
		while (index < str.length() && Character.isDigit(str.charAt(index))) {
			int d = str.charAt(index) - '0';
			if (sign > 0 && val > (Integer.MAX_VALUE - d) / 10) {
				return Integer.MAX_VALUE;
			} else if (sign < 0 && val > (Integer.MIN_VALUE + d) / -10) {
				return Integer.MIN_VALUE;
			}
			val = 10 * val + d;
			index++;
		}

		return val * sign;
	}
}