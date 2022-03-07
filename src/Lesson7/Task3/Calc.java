package Lesson7.Task3;
import java.util.Stack;

public class Calc {
    public static String ExpressionToRPN(String expr) {
        String current = "";
        Stack<Character> stack = new Stack<>();
        int priority;
        for (int i = 0; i < expr.length(); i++) {
            priority = Getp(expr.charAt(i));

            if (priority == 0) current += expr.charAt(i);
            if (priority == 1) stack.push(expr.charAt(i));
            if (priority > 1) {
                current += ' ';
                while (!stack.empty()) {
                    if (Getp(stack.peek()) >= priority) current += stack.pop();
                    else break;

                }
                stack.push(expr.charAt(i));
            }
            if(priority == -1) {
                current += ' ';
                while (Getp(stack.peek()) != 1) current += stack.pop();
                stack.pop();
            }
            }
        while (!stack.empty()) current+=stack.pop();
        return current;
    }
    public static double RPNtoAnswer(String rpn) {
        String operand ="";
        Stack<Double> stack = new Stack<>();
        for (int i = 0; i <rpn.length() ; i++) {
            if(Getp(rpn.charAt(i))==' ')continue;

            if(Getp(rpn.charAt(i))==0){
                while (rpn.charAt(i) != ' ' && Getp(rpn.charAt(i))==0){
                    operand +=rpn.charAt(i++);
                    if(i == rpn.length()) break;}
                stack.push(Double.parseDouble(operand));
                operand = new String();
            }
if(Getp(rpn.charAt(i))>1){
    double a = stack.pop();
    double b = stack.pop();

    if (rpn.charAt(i)=='+') stack.push(b+a);
    if (rpn.charAt(i)=='-') stack.push(b-a);
    if (rpn.charAt(i)=='*') stack.push(b*a);
    if (rpn.charAt(i)=='/') stack.push(b/a);
}
        }

        return stack.pop();
    }
    private static int Getp(char tocen) {
        if (tocen == '*' || tocen == '/') return 3;
        else if (tocen == '+' || tocen == '_') return 2;
        else if (tocen == '(') return 1;
        else if (tocen == ')') return -1;
        else return 0;
    }
}
