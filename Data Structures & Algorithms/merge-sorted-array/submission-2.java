class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0, i = 0;
        // Arrays.sort(nums1);
        while(i<m || j<n){
            if(nums1[i] == 0){
                nums1[i] = nums2[j];
                j++;
                i++;
            }
            else i++;
        }
        Arrays.sort(nums1);
        
    }
}