/**
 * InBuiltExamples
 */

import java.util.LinkedList;
import java.util.Queue;
public class InBuiltExamples {

    public static void main(String[] args) {
        // Stack<Integer> stack = new Stack<>();
        // stack.push(34);
        // stack.push(45);
        // stack.push(2);
        // stack.push(9);
        // stack.push(18);
        // stack.push(100);
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());

        Queue<Integer> q= new LinkedList<>();
        q.add(3);
        q.add(6);
        q.add(5);
        q.add(19);
        q.add(1);

        System.out.println(q.peek());
            
        
    }
} 