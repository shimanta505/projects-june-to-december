package leetcode;

import java.util.Stack;

public class BalancedParentheses {
    public boolean isValid(String s) {

        Stack<Character> check = new Stack<>();

        for (int i =0;i<s.length();i++){
            if (s.charAt(i)=='[' || s.charAt(i) == '{' || s.charAt(i) == '('){
                check.push(s.charAt(i));
            }else if(s.charAt(i) == ']' || s.charAt(i) == '}' || s.charAt(i) == ')'){
                if (check.isEmpty()){
                    return false;
                }
                int difference = Math.abs(s.charAt(i)-check.pop());
                if (difference>2){
                    return false;
                }
            }
        }
        if (!check.isEmpty()){
            return false;
        }


        return true;
    }
}
