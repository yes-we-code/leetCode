public class Solution {
	public void merge(int A[], int m, int B[], int n) {
		int lastA = m - 1;
		int lastB = n - 1;
		while (lastB >= 0) {
			if (lastA >= 0 && A[lastA] > B[lastB]) {
				A[lastA + lastB + 1] = A[lastA];
				lastA--;
			} else {
				A[lastA + lastB + 1] = B[lastB];
				lastB--;
			}
		}
	}
}