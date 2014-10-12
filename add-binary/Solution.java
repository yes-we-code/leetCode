public class Solution {
	public String addBinary(String a, String b) {
		if (a.isEmpty()) {
			return b;
		}
		if (b.isEmpty()) {
			return a;
		}
		int carry = 0;
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < Math.max(a.length(), b.length()); i++) {
			int sum = carry;
			if (i < a.length()) {
				sum += a.charAt(a.length() - i - 1) - '0';
			}
			if (i < b.length()) {
				sum += b.charAt(b.length() - i - 1) - '0';
			}
			sb.append(sum % 2);
			carry = sum / 2;
		}
		if (carry > 0) {
			sb.append(carry);
		}
		sb.reverse();
		return sb.toString();
	}
}
