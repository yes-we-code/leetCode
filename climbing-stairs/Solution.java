public class Solution {
    public int climbStairs(int n) {
    	if (n < 0) {
    		return 0;
    	}
    	int t1 = 0, t2 = 1, t3;
    	for (int i = 0; i < n; i++) {
    		t3 = t1 + t2;
    		t1 = t2;
    		t2 = t3;
    	}
    	return t2;
    }
}