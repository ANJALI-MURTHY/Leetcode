class Solution {
    public static Boolean isPossible(int[] piles, int h, int k) {
        int total_hours = 0;
        for (int pile : piles) {
            //total_hours += (pile + k - 1) / k; // This is equivalent to Math.ceil(pile / (double) k)
            total_hours += Math.ceil(pile/(double)k);
        }
        return total_hours <= h;
    }

    public int minEatingSpeed(int[] piles, int h) {
        // Binary search for the minimum eating speed
        int left = 1;  // The minimum possible eating speed
        int right = 0; // Initialize with the maximum pile size
        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (isPossible(piles, h, mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
