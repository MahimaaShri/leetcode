class Solution {
    public boolean isPalindrome(String s) {
        char arr[]=s.toCharArray();
        String c="";
        for(char ch:arr)
        {
            if(Character.isLetterOrDigit(ch)){
                c+=Character.toLowerCase(ch);
            }
        }
        int i=0,j=c.length()-1;
        while(i<j)
        {
            if(c.charAt(i)!=c.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}