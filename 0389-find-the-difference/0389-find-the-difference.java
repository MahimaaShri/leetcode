class Solution {
    public char findTheDifference(String s, String t) {
        int sum = 0,sumt = 0;
        for(char c:s.toCharArray()) sum += c;
        for(char c:t.toCharArray()) sumt += c;
        return (char)(sumt-sum);
    }
}