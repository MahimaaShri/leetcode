class Solution {
public:
    bool isPalindrome(string s) {
        
        string al="";
        for(char ch:s)
        {
            if(isalnum(ch))
            {
                al+=tolower(ch);
            }
        }
        string rev=al;
        reverse(al.begin(),al.end());
        if(rev==al)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
};