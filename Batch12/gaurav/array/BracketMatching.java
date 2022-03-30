class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<Character>();
        
        for(int i=0; i<s.length(); i++) {
            char result = s.charAt(i);
            System.out.println(i);
            if(result == '(' || result == '{' || result == '[') {
                stk.push(result);
                continue;
            }
            
            if(result == ')' && !stk.empty() && stk.peek() == '(') {
                stk.pop();
            }
            
            else if(result == ']' && !stk.empty() && stk.peek() == '[') {
                stk.pop();
            }
            
            else if(result == '}' && !stk.empty() && stk.peek() == '{') {
                stk.pop();
            }
            else {
                return false;
            }
        }
               
        if(stk.empty()) return true;
        else return false;
    }
}
