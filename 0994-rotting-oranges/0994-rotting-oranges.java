class Solution {
    public int orangesRotting(int[][] a) {
       int r=a.length;
       int c=a[0].length;
       Queue<Integer> row = new LinkedList<>();
       Queue<Integer> col = new LinkedList<>();
       int fresh=0;
       for(int i=0;i<r;i++)
       {
        for(int j=0;j<c;j++)
        {
            if(a[i][j]==2)
            {
                row.add(i);
                col.add(j);
            }
            if(a[i][j]==1)
                fresh++;
        }
       }
       int time=0;
       while(!row.isEmpty())
       {
        int s=row.size();
        for(int x=0;x<s;x++)
        {
            int i = row.remove();
            int j = col.remove();
            if (i>0 && a[i-1][j]==1) 
            {
                a[i-1][j]=2;
                fresh--;
                row.add(i-1);
                col.add(j);
            }
            if (i<r-1 && a[i+1][j]==1) 
            {
                a[i+1][j]=2;
                fresh--;
                row.add(i+1);
                col.add(j);
            }
            if (j>0 && a[i][j-1]==1) 
            {
                a[i][j-1]=2;
                fresh--;
                row.add(i);
                col.add(j-1);
            }
            if (j<c-1 && a[i][j+1]==1) 
            {
                a[i][j+1]=2;
                fresh--;
                row.add(i);
                col.add(j+1);
            }
        }
        if(!row.isEmpty())
            time++;
       }
       if(fresh>0)
        return -1;
    return time;
    }
}