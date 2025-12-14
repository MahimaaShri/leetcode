class Solution {
    public int findComplement(int num) {
        int m = 0;
        int n= num;
        while (n > 0) {
            m = (m<< 1) | 1;
            n= n >> 1;
        }
        return num ^ m;
    }
}