class Solution {
    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        // find min and max
        for (int num : nums) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        // return gcd of min and max
        return gcd(min, max);
    }

    public int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
