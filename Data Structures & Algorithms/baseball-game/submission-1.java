class Solution {
    public int calPoints(String[] operations) {
        Stack<String> stack = new Stack<>();
        for(String s: operations){
            // System.out.println(s);
            // System.out.println(stack);

            if(s.equals("+")){
                String a = stack.pop();
                String b = stack.pop();
                int result = Integer.parseInt(a)+Integer.parseInt(b);
                stack.push(b);
                stack.push(a);
                stack.push(String.valueOf(result));
            }
            else if(s.equals("D")){
                String a = stack.pop();
                int result = 2 * Integer.parseInt(a);
                stack.push(a);
                stack.push(String.valueOf(result));
            }
            else if(s.equals("C")){
                stack.pop();
            }
            else{
                stack.push(s);
            }
        }
        // System.out.println(stack);
        int result = 0;

        for(String c: stack){
            result += Integer.parseInt(c);
        }

        return result;
    }
    
}