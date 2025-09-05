package easy;

import java.util.HashMap;
import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 */
public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("({[]})"));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        for(char c : s.toCharArray()){
            if(map.containsValue(c)){
                stack.push(c);
            }else if(map.containsKey(c)){
                if(stack.isEmpty() || map.get(c) != stack.pop()){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
