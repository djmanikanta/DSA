class Solution {
    public String longestCommonPrefix(String[] strs){
        if (strs == null || strs.length == 0) return "";
        String firstString = strs[0];
        String ans = "";
        for (int i = 0; i < firstString.length(); i++) {
            char ch = firstString.charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length()) {
                    return ans;
                }
                if (strs[j].charAt(i) != ch) {
                    return ans;
                }
            }

            ans += ch;
        }
        return ans;
    }
}