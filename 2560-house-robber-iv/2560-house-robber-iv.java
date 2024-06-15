class Solution {
    public int minCapability(int[] nums, int k) {
        // find the range of the possible capabilities
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        // binary search
        int start = min, end = max;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (isPossible(nums, mid, k)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
    private boolean isPossible(int[] nums, int target, int k) {
        // greedy here
        int lastStolenIndex = -2;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] <= target && lastStolenIndex + 1 < i) {
                k -= 1;
                lastStolenIndex = i;
                if (k == 0) return true;
            }
        }
        return false;
    }
}