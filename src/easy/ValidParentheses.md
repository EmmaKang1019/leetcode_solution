# Problem 20. Valid Parenthese
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.  

Example 1:  
Input: s = "()"  
Output: true  

Example 2:  
Input: s = "()[]{}"  
Output: true

Example 3:  
Input: s = "(]"  
Output: false  

Example 4:  
Input: s = "([])"  
Output: true  

Example 5:  
Input: s = "([)]"  
Output: false
## Brute force
```commandline
 public static boolean isValid(String s) {
        for(int i = 0; i< s.length(); i++){
            int prevlen = s.length();
            s= s.replace("()", "").replace("[]", "").replace("{}", "");
            System.out.println("s:::" + s);
            System.out.println("i :::: " + i);
            if(s.isEmpty()) return true;
            if(s.length() == prevlen) break;
        }
        return s.isEmpty();
    }
```

## Solution
Using HashMap and Stack
We declare a stack to store opening parentheses, so the stack only contains open brackets. Then we create a hashmap to check matching pairs. Because validation is based on checking whether each closing bracket has the correct opening bracket before it, the closing bracket is used as the key and the opening bracket as the value.

As we iterate through the string character by character, we first check if the character is an opening or a closing bracket. If it is an opening bracket, we recognize it using containsValue and push it onto the stack. If it is a closing bracket, we must first check whether the stack is empty. If the stack is empty, that means there is no opening bracket to match, so the string is invalid and we return false. If the stack is not empty, we use the hashmap to find the opening bracket that matches the current closing bracket, and we compare it with the element popped from the stack. If they do not match, the pair is invalid and we return false.

If they do match, the pop operation removes the top of the stack, so by the end of the iteration, we check whether the stack is empty. If the stack is empty, that means every opening bracket had a valid closing bracket, so the string is valid. If the stack is not empty, some brackets were left unmatched, so the string is invalid.
```commandline
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
```