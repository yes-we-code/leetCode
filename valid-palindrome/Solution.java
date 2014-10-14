public class Solution {
	private boolean isAlphanumeric(char ch) {
		return Character.isAlphabetic(ch) || Character.isDigit(ch);
	}

	public boolean isPalindrome(String s) {
		if (s.isEmpty()) {
			return true;
		}
		int start = 0;
		int last = s.length() - 1;
		while (true) {
			while (start < s.length() && !isAlphanumeric(s.charAt(start))) {
				start++;
			}
			while (last >= 0 && !isAlphanumeric(s.charAt(last))) {
				last--;
			}
			if (start >= last) {
				break;
			}
			if (Character.toLowerCase(s.charAt(start)) != Character
					.toLowerCase(s.charAt(last))) {
				return false;
			}
			start++;
			last--;

		}
		return true;
	}
}