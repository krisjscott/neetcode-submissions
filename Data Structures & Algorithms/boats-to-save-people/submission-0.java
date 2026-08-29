class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int first = 0; //light person
        int second = people.length - 1; //heavy person
        int count = 0;
        while(first <= second){
            if(people[first] + people[second] <= limit){
                first++;
                second--;
            } else {
                second--;
            }
            count++;
        }
        return count;
    }
}