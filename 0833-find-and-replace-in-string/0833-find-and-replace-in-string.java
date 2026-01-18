class Solution {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {

        String result = "";
        int i = 0;

        while (i < s.length()) {

            boolean replaced = false;

            for (int j = 0; j < indices.length; j++) {
                if (indices[j] == i &&
                    i + sources[j].length() <= s.length() &&
                    s.substring(i, i + sources[j].length()).equals(sources[j])) {

                    result = result + targets[j];
                    i = i + sources[j].length();
                    replaced = true;
                    break;
                }
            }

            if (!replaced) {
                result = result + s.charAt(i);
                i++;
            }
        }

        return result;
    }
}
