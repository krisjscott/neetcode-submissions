class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String c : tokens) {
            if (c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/")) {
                int b = stack.pop();
                int a = stack.pop();
            
                switch (c) {
                    case "+": stack.push(a + b); break;
                    case "-": stack.push(a - b); break;
                    case "*": stack.push(a * b); break;
                    case "/": stack.push(a / b); break;
                }
            } else {
                stack.push(Integer.parseInt(c));
            }
        }
        return stack.pop();
    }
}
