import java.util.Arrays;
import java.util.Stack;

public class StringIsValid {
    public static void main(String[] args) {
        boolean isValidString1 = isValid("(())");
        boolean isValidString2 = isValid("))((");
        boolean isValidString3 = isValid("((((((");
        boolean isValidString4 = isValid("()()(()())");

        System.out.println("isValidString1 = " + isValidString1);
        System.out.println("isValidString2 = " + isValidString2);
        System.out.println("isValidString3 = " + isValidString3);
        System.out.println("isValidString4 = " + isValidString4);
    }

    public static boolean isValid(String data) {
        char[] array = data.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char c : array) {
            if (stack.isEmpty()) {
                stack.push(c);
                continue;
            }
            if (stack.peek() == '(' && c == ')')
                stack.pop();
            else
                stack.push(c);
        }
        return stack.size()==0;
    }
}