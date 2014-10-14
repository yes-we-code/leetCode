public class Solution {
    public int removeDuplicates(int[] A) {
    	if (A == null || A.length == 0) {
    		return 0;
    	}
    	int offset = 0;
    	int value = A[0];
    	for (int i = 1; i < A.length; i++) {
    		if (A[i] == value) {
    			offset++;
    		} else {
    			value = A[i];
    			A[i-offset] = A[i];
    		}
    	}
    	return A.length - offset;
    }
}