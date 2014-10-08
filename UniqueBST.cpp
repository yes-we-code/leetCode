//Given n, how many structurally unique BST's (binary search trees) that store values 1...n?
class Solution {
public:
    int numTrees(int n) {
        if(n == 0 || n == 1) return 1;
        int count = 0;
        for(int i = 0;i < n;i ++){
            count = count + numTrees(i)*numTrees(n-i-1);
        }
        return count;
    }
};
