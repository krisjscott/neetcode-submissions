class Solution {
    public int[] sortArray(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }
    public int[] mergeSort(int[] num, int left, int right){
        if (left == right){
            return num;
        } 
        int mid = left+(right-left)/2;
        mergeSort(num, left, mid);
        mergeSort(num, mid+1, right);
        merge(num, left, mid, right);
        return num;
    }
    public void merge(int[] num, int left, int mid, int right){
        ArrayList<Integer> temp = new ArrayList<>();

        int i = left;
        int j = mid+1;

        while(i<=mid && j<=right){
            if(num[i]<=num[j]){
                temp.add(num[i]);
                i++;
            }
            else{
                temp.add(num[j]);
                j++;
            }
        }

        while(i<=mid){
            temp.add(num[i]);
            i++;
        }
        while(j<=right){
            temp.add(num[j]);
            j++;
        }

        for(int o = left; o<=right; o++){
            num[o] = temp.get(o-left);
        }
    }
}