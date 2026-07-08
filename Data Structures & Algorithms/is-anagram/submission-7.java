class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        List<Character> set1 = new ArrayList<>();
        List<Character> set2 = new ArrayList<>(); 

        for(char c: s.toCharArray()){
            set1.add(c);
        }    
        for(char a: t.toCharArray()){
            set2.add(a);
        }
        
        Collections.sort(set1, Collections.reverseOrder());
        Collections.sort(set2, Collections.reverseOrder());

        if(set1.equals(set2)) return true;
        else return false; 
    }
}
