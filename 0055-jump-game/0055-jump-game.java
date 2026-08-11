class Solution {
    public boolean canJump(int[] nums) {
        int r=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(i>r)
                return false;
            r=Math.max(r,i+nums[i]);
            if(r>=n-1)
                return true;
        }
        return true;
    }
}