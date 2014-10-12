import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	public List<String> anagrams(String[] strs) {
		Map<String, List<String>> buckets = new HashMap<>();
		for (int i = 0; i < strs.length; i++) {
			String str = strs[i];
			String nstr = normalize(str);
			if (!buckets.containsKey(nstr)) {
				buckets.put(nstr, new ArrayList<String>());
			}
			buckets.get(nstr).add(str);
		}
		List<String> result = new ArrayList<String>();
		for (List<String> list : buckets.values()) {
			if (list.size() > 1) {
				result.addAll(list);
			}
		}
		return result;
	}

	public String normalize(String str) {
		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		return new String(arr);
	}
}
