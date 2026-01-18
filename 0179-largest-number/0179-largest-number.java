class Solution {
    public String largestNumber(int[] nums) {

        String[] arr = new String[nums.length];

        // convert numbers to strings
        for (int i = 0; i < nums.length; i++) {
            arr[i] = "" + nums[i];
        }

        // simple sorting using comparison
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if ((arr[i] + arr[j]).compareTo(arr[j] + arr[i]) < 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // if highest value is 0
        if (arr[0].equals("0")) {
            return "0";
        }

        // join all strings
        String ans = "";
        for (int i = 0; i < arr.length; i++) {
            ans = ans + arr[i];
        }

        return ans;
    }
}
