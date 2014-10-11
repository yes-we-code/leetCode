public class Solution {
	public void setZeroes(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		// determine whether first row or first column should be zero 
		boolean firstRowZero = false;
		boolean firstColZero = false;
		for (int j = 0; j < n; j++) {
			if (matrix[0][j] == 0) {
				firstRowZero = true;
				break;
			}
		}
		for (int i = 0; i < m; i++) {
			if (matrix[i][0] == 0) {
				firstColZero = true;
				break;
			}
		}
		// find zeroes, save to first row and first column
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				if (matrix[i][j] == 0) {
					matrix[0][j] = 0;
					matrix[i][0] = 0;
				}
			}
		}
		// set zeros for rows
		for (int i = 1; i < m; i++) {
			if (matrix[i][0] == 0) {
				for (int j = 1; j < n; j++) {
					matrix[i][j] = 0;
				}
			}
		}
		// set zeros for columns
		for (int j = 1; j < n; j++) {
			if (matrix[0][j] == 0) {
				for (int i = 1; i < m; i++) {
					matrix[i][j] = 0;
				}
			}
		}
		if (firstRowZero) {
			for (int j = 0; j < n; j++) {
				matrix[0][j] = 0;
			}
		}
		if (firstColZero) {
			for (int i = 0; i < m; i++) {
				matrix[i][0] = 0;
			}
		}
	}
}