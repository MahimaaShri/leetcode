class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0)
        {
            return false;
        }
        else if(n==1)
        {
            return true;
        }
        for(int i=1;Math.pow(4,i)<=n;i++)
        {
            if(Math.pow(4,i)==n)
                return true;
        }
        return false;
    }
}