class Solution {
    public int minCapability(int[] nums, int k) {
        int low = Integer.MAX_VALUE, high = 0;

        for (int x : nums) {
            low = Math.min(low, x);
            high = Math.max(high, x);
        }

        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canRob(nums, k, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private boolean canRob(int[] nums, int k, int cap) {
        int count = 0;
        int i = 0;

        while (i < nums.length) {
            if (nums[i] <= cap) {
                count++;
                i += 2; 
            } else {
                i++;
            }
            if (count >= k) return true;
        }
        return false;
    }
}
