class Solution {
    public boolean isPalindrome(int x)
    {
        int num=x;
        int temp=0;
        if(x<0)
        {
            return false;
        }
        while(x!=0)
        {
            temp=temp*10+x%10;
            x=x/10;
        }
        return temp==num;
    }
}