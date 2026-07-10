class Solution {
    public int[] twoSum(int[] nums, int target) {

        int left = 0, right = nums.length-1;

        while(left<right){
            int curSum = nums[left]+nums[right];
            if(curSum>target){
                right--;
            }
            else if(curSum<target){
                left++;
            }
            else{
                
                return new int[]{left+1, right+1};
            }
        }

        return new int[0];
    }
}
