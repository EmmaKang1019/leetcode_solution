package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * You are keeping the scores for a baseball game with strange rules. At the beginning of the game, you start with an empty record.
 *
 * You are given a list of strings operations, where operations[i] is the ith operation you must apply to the record and is one of the following:
 *
 * An integer x.
 * Record a new score of x.
 * '+'.
 * Record a new score that is the sum of the previous two scores.
 * 'D'.
 * Record a new score that is the double of the previous score.
 * 'C'.
 * Invalidate the previous score, removing it from the record.
 * Return the sum of all the scores on the record after applying all the operations.
 *
 * The test cases are generated such that the answer and all intermediate calculations fit in a 32-bit integer and that all operations are valid.
 */
public class BasebalLGame {
    public static void main(String[] args) {
        System.out.println(calPoints(new String[]{"5","-2","4","C","D","9","+","+"}));
    }
    public static int calPoints(String[] operations) {
        Stack<String> stack = new Stack<>();
        int sum = 0;

        for(String s : operations){
            switch (s){
                case "C" : stack.pop();
                            break;
                case "D" :  int num = Integer.parseInt(stack.peek());
                            stack.push(Integer.toString(num*2));
                            break;
                case "+" : int num2 = Integer.parseInt( stack.get(stack
                            .size()-1)) + Integer.parseInt( stack.get(stack.size()-2));
                            stack.push(Integer.toString(num2));
                            break;
                default: stack.push(s);
            }
        }
        for(String st : stack){
            sum += Integer.parseInt(st);
        }
        return sum;

    }
}
