class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        rotate(nums, 0, nums.length-1);
        rotate(nums, 0, k-1);
        rotate(nums, k, nums.length-1);
    }
    private void rotate(int[] nums, int start, int last){
        while(start<last){
            int temp = nums[last];
            nums[last] = nums[start];
            nums[start] = temp;
            start++;
            last--;
        }
    }
}