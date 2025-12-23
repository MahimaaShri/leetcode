class Solution {
    public int strStr(String haystack, String needle) {
        int n=haystack.indexOf(needle);
        if(n>=0)
        {
            return haystack.indexOf(needle);
        }
        else{
            return -1;
        }
    }
}