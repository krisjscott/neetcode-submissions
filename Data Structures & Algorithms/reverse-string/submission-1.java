class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        int i = 0;
        int j = n-1;
        while(i<j){
            char first = s[i];
            s[i] = s[j];
            s[j] = first;
            j--;
            i++;
        }
    }
}