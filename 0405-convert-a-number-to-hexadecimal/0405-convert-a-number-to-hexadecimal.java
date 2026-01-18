class Solution {
    public String toHex(int num) {

        if (num == 0) return "0";

        char[] hex = "0123456789abcdef".toCharArray();
        String ans = "";

        while (num != 0) {
            ans = hex[num & 15] + ans;
            num >>>= 4;
        }

        return ans;
    }
}
