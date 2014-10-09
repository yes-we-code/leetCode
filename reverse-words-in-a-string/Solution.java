public class Solution {
	public String reverseWords(String s) {
		s = s.trim();
		String[] words = s.split(" ");
		StringBuffer sb = new StringBuffer();
		for (int i = words.length - 1; i >= 0; i--) {
			if (!words[i].isEmpty()) {
				sb.append(words[i]);
				sb.append(" ");
			}
		}
		if (sb.length() > 0) {
			sb.deleteCharAt(sb.length() - 1);
		}
		return sb.toString();
	}
}