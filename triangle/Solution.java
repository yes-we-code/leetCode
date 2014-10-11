import java.util.List;

public class Solution {
	public int minimumTotal(List<List<Integer>> triangle) {
		int n = triangle.size();
		if (n == 0) {
			return 0;
		}
		int[] best = new int[n];
		int[] prev = new int[n];
		for (int i = 0; i < n; i++) {
			best[0] = prev[0] + triangle.get(i).get(0);
			for (int j = 1; j < i; j++) {
				best[j] = Math.min(prev[j - 1] + triangle.get(i).get(j),
						prev[j] + triangle.get(i).get(j));
			}
			if (i > 0) {
				best[i] = prev[i-1] + triangle.get(i).get(i);
			}
			System.arraycopy(best, 0, prev, 0, i + 1);
		}
		int min = best[0];
		for (int i = 1; i < n; i++) {
			min = Math.min(best[i], min);
		}
		return min;
	}
}