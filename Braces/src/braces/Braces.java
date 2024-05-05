package braces;

import java.util.Stack;

public class Braces {

    public static void main(String[] args) {
        String s[] = {"{}(","({)}","}{"};
        for(int i=0;i<s.length;i++){
            System.out.println(isBalanced(s[i]));
        }
}

    static boolean isBalanced(String name) {
        Stack stack = new Stack();
        Stack temp = new Stack();
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == '{') {
                stack.push(name.charAt(i));
            } else if (name.charAt(i) == '(') {
                stack.push(name.charAt(i));
            } else if (name.charAt(i) == '}') {
                if (!stack.isEmpty()) {
                    if (stack.peek().equals('{')) {
                        stack.pop();
                    }
                }
            } else if (name.charAt(i) == ')') {
                if (!stack.isEmpty()) {
                    if (stack.peek().equals('(')) {
                        stack.pop();
                    }
                }
            } else if (name.charAt(i) == ']') {
                if (!stack.isEmpty()) {
                    if (stack.peek().equals('[')) {
                        stack.pop();
                    }
                }
            } else {
                temp.push(name.charAt(i));
            }
        }
        if (stack.isEmpty() && temp.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
