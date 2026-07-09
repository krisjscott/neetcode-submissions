class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int left = 1;
        int right = 1;
        int[] results = new int[n];

        for(int i = n-1; i>=0; i--){
            results[i] = right;
            right*=nums[i];
        }
        for(int i =0; i<n; i++){
            results[i] *= left;
            left*=nums[i];
        }
        return results;
    }
}  
