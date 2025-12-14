class Solution {
    public int fib(int n) 
    {
        int sum=0;
        int a=0,b=1;
        if(n==1)
        {
            return 1;
        }
        else if(n==0)
        {
            return 0;
        }
        for(int i=2;i<=n;i++)
        {
            sum=a+b;
            a=b;
            b=sum;  
        }
        return sum;
    }
}