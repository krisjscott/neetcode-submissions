class Solution {
    public int maxArea(int[] heights) {
        int left = 0, right = heights.length -1;
        int area = 0;
        while(left<right){
            int length = Math.min(heights[left], heights[right]);
            int width = Math.abs(left-right);

            area = Math.max(area, length*width);

            if(heights[left]<heights[right]){
                left++;
            }
            else if(heights[left]>heights[right]){
                right--;
            }
            else{
                left++;
                right--;
            }
        }
        return area;
    }
}
