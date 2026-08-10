class Solution {
    int dp[][];
    public int longestIncreasingPath(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        dp=new int[r][c];
        int ans=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                ans=Math.max(ans,dfs(matrix,i,j));
            }
        }
        return ans;
    }
    int dfs(int a[][],int i,int j)
    {
        if(dp[i][j]!=0)
            return dp[i][j];
        int max=1;
        if(i>0 && a[i-1][j]>a[i][j])
            max=Math.max(max,1+dfs(a,i-1,j));
        if(i+1<a.length && a[i+1][j]>a[i][j])
            max=Math.max(max,1+dfs(a,i+1,j));
        if(j>0 && a[i][j-1]>a[i][j])
            max=Math.max(max,1+dfs(a,i,j-1));
        if(j+1<a[0].length && a[i][j+1]>a[i][j])
            max=Math.max(max,1+dfs(a,i,j+1));
        dp[i][j]=max;
        return max;
    }
}