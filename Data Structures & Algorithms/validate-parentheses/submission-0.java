class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character,Character> closeTOopen = new HashMap<>();
        closeTOopen.put(')','(');
        closeTOopen.put(']','[');
        closeTOopen.put('}','{');

        for(char c : s.toCharArray()){
            if(closeTOopen.containsKey(c)){
                if(!stack.isEmpty() && stack.peek() == closeTOopen.get(c)){
                    stack.pop();
                }else{
                    return false;
                }
            }else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
