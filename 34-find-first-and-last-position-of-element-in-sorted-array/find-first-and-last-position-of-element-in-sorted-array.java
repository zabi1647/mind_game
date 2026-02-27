class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = searchNumber(nums, target, true);
        int end = searchNumber(nums, target, false);
        int[] ans = { start, end };
        return ans;
    }
    public  int searchNumber(int[] nums, int target, boolean isfound) {
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > target) {
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                ans = mid;
                if (isfound) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }

        return ans;
    }
}