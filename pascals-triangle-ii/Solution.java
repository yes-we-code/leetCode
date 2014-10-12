import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<Integer> getRow(int rowIndex) {
		int n = rowIndex + 1;
		if (n < 0) {
			return null;
		}
		int[] curr = new int[n];
		int[] prev = new int[n];
		for (int i = 0; i < n; i++) {
			curr[0] = 1;
			for (int j = 1; j < i; j++) {
				curr[j] = prev[j - 1] + prev[j];
			}
			if (i > 0) {
				curr[i] = 1;
			}
			System.arraycopy(curr, 0, prev, 0, i + 1);
		}
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			result.add(curr[i]);
		}
		return result;
	}
}