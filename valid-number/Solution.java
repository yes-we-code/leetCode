public class Solution {
	public boolean isNumber(String s) {
		boolean hasDigits = false;
		s = s.trim();
		int index = 0;
		// handle empty
		if (s.isEmpty()) {
			return false;
		}
		// handle sign
		if (s.charAt(0) == '-' || s.charAt(0) == '+') {
			index++;
		}
		// shouldn't stop here
		if (index == s.length()) {
			return false;
		}
		// handle integer part digits
		while (index < s.length() && '0' <= s.charAt(index)
				&& s.charAt(index) <= '9') {
			index++;
			hasDigits = true;
		}
		// could stop here
		if (index == s.length()) {
			return hasDigits;
		}
		// handle decimal point
		if (s.charAt(index) == '.') {
			index++;
			// handle fractional part digits
			while (index < s.length() && '0' <= s.charAt(index)
					&& s.charAt(index) <= '9') {
				index++;
				hasDigits = true;
			}
		}
		// could stop here
		if (index == s.length()) {
			return hasDigits;
		}
		// handle exponent of ten
		if (Character.toLowerCase(s.charAt(index)) == 'e') {
			index++;
			// shouldn't stop here
			if (index == s.length()) {
				return false;
			}
			// handle sign of exponent
			if (s.charAt(index) == '-' || s.charAt(index) == '+') {
				index++;
			}
			// shouldn't stop here
			if (index == s.length()) {
				return false;
			}
			// handle exponent digits
			if ('0' <= s.charAt(index) && s.charAt(index) <= '9') {
				do {
					index++;
				} while (index < s.length() && '0' <= s.charAt(index)
						&& s.charAt(index) <= '9');
			} else {
				return false;
			}
		}
		// could stop here
		if (index == s.length()) {
			return hasDigits;
		}
		// shouldn't have something remains
		return false;
	}
}