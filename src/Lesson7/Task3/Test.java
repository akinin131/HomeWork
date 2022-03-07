package Lesson7.Task3;

public class Test {
    public static void main(String[] args) {
        System.out.println(Calc.ExpressionToRPN("2+2*2"));
        System.out.println(Calc.RPNtoAnswer(Calc.ExpressionToRPN("2+2*2")));
    }
}
