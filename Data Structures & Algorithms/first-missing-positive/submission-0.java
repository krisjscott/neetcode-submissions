class Solution {
    public int firstMissingPositive(int[] nums) {
        int missing = 1;
        Arrays.sort(nums);
        for(int num : nums){
            if(missing == num){
                missing++;
            }
        }
        return missing; 
    }
}