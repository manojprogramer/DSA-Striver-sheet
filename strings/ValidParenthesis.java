package com.manoj.strings;

import java.util.Stack;

public class ValidParenthesis {
    public boolean validParenthesis(String s){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
                stack.push(s.charAt(i));
            else if(stack.peek() == '(' && s.charAt(i) == ')' || stack.peek() == '[' && s.charAt(i) == ']'
            || stack.peek() == '{' && s.charAt(i) == '}')
                stack.pop();
        }
        if(stack.isEmpty()) return true;
        else return false;
    }
}
