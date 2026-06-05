class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] value1 = new int[26];
        int[] value2 = new int[26];

        if(s1.length()>s2.length()){
            return false;
        }

        for(int i = 0; i<s1.length(); i++){
            value1[s1.charAt(i)-'a']++;
            value2[s2.charAt(i)-'a']++;
        }

        if(Arrays.equals(value1, value2)) return true;

        for(int i = s1.length(); i<s2.length(); i++){
            value2[s2.charAt(i) - 'a']++;
            value2[s2.charAt(i-s1.length())-'a']--;
            if(Arrays.equals(value1, value2)) return true;
        }
        

        return false;
    }
    
}
