class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums == null || nums.length < 4) return ans;

        Arrays.sort(nums);
        int n = nums.length;

        for (int a = 0; a < n - 3; a++) {
            // Skip duplicates for the 1st element
            if (a > 0 && nums[a] == nums[a - 1]) continue;

            for (int b = a + 1; b < n - 2; b++) {
                // Skip duplicates for the 2nd element
                if (b > a + 1 && nums[b] == nums[b - 1]) continue;

                int l = b + 1;
                int r = n - 1;

                while (l < r) {
                    // Cast to long to prevent integer overflow
                    long sum = (long) nums[a] + nums[b] + nums[l] + nums[r];

                    if (sum == target) {
                        ans.add(Arrays.asList(nums[a], nums[b], nums[l], nums[r]));
                        l++;
                        r--;

                        // Skip duplicates for 3rd and 4th elements
                        while (l < r && nums[l] == nums[l - 1]) l++;
                        while (l < r && nums[r] == nums[r + 1]) r--;
                    } else if (sum < target) {
                        l++;
                    } else {
                        r--;
                    }
                }
            }
        }

        return ans;
    }
}