public class Solution {
	public int numDecodings(String s) {
		if (s.isEmpty()) {
			return 0;
		} else if (s.charAt(0) == '0') {
			return 0;
		}
		int n = s.length();
		int t1 = 1;
		int t2 = 1;
		for (int i = 1; i < n; i++) {
			int t3 = 0;
			if ('1' <= s.charAt(i) && s.charAt(i) <= '9') {
				t3 += t2;
			}
			int code = Integer.parseInt(s.substring(i - 1, i + 1));
			if (10 <= code && code <= 26) {
				t3 += t1;
			}
			if (t3 == 0) {
				return 0;
			}
			t1 = t2;
			t2 = t3;
		}
		return t2;
	}
}