public class Solution {
	public String strStr(String haystack, String needle) {
		if (haystack == null || needle == null) {
			return null;
		}
		if (needle.isEmpty()) {
			return haystack;
		}
		int beginIndex = -1;
		for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
			boolean match = true;
			for (int j = 0; j < needle.length(); j++) {
				if (haystack.charAt(i + j) != needle.charAt(j)) {
					match = false;
					break;
				}
			}
			if (match) {
				beginIndex = i;
				break;
			}

		}
		if (beginIndex >= 0) {
			return haystack.substring(beginIndex);
		} else {
			return null;
		}
	}
}