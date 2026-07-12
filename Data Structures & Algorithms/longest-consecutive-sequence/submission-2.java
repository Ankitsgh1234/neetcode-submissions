class Solution {
    public int longestConsecutive(int[] nums) {

        int n = nums.length;

        if (n == 0) {
            return 0;
        }

        Arrays.sort(nums);

        int i = 0;
        int c = 1;
        int max = 1;

        while (i < n - 1) {

            if (nums[i] == nums[i + 1]) {
                i++;
                continue;
            }

            if (nums[i] + 1 == nums[i + 1]) {
                c++;
            } else {
                max = Math.max(max, c);
                c = 1;
            }

            i++;
        }

        return Math.max(max, c);
    }
}