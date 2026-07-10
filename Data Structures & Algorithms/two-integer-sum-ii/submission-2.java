class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

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
                result[0] = left+1;
                result[1] = right+1;
                return result;
            }
        }

        return result;
    }
}
