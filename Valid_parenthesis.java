//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
  class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            else if(ch == ')'){
                //check for the popped item from stack
                if(stack.isEmpty() || stack.pop() != '('){
                    return false;
                }
            }
            else if(ch == '}'){
                if(stack.isEmpty() || stack.pop() != '{'){
                    return false;
                }
            }
            else if(ch == ']'){
                if(stack.isEmpty() || stack.pop() != '['){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
