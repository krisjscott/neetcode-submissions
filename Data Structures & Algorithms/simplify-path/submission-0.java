class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] s = path.split("/");

        for(String c: s){
            if(c.equals("..")){
                if(!stack.isEmpty()) stack.pop();
            }
            else if(!c.equals(".") && !c.equals("")){
                stack.push(c);
            }
        }

        return "/"+String.join("/", stack);
    }
}