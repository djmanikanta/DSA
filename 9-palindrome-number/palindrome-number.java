class Solution {
    public boolean isPalindrome(int x) {
        Integer y = x;
        StringBuffer s = new StringBuffer(y.toString());
        return (s.reverse().toString().equals(y.toString()));
    }
}
