public class Solution {
	public int removeElement(int[] A, int elem) {
		int n = A.length;
		for (int i = 0; i < n; i++) {
			if (A[i] == elem) {
				while (n > i && A[n - 1] == elem) {
					n--;
				}
				if (n - 1 > i) {
					A[i] = A[n - 1];
					n--;
				}
			}
		}
		return n;
	}
}