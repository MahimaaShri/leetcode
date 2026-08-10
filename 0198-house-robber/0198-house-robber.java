class Solution {
    public int rob(int[] nums) {
        int prev=0;
        int prev1=0;
        for(int m:nums)
        {
            int cur=Math.max(prev1,m+prev);
            prev=prev1;
            prev1=cur;
        }
        return prev1;
    }
}