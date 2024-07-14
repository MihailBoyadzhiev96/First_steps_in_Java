package Operators;

public class TernaryOperators {
    public static void main(String[] args) {
       int num1, num2;
       num1 = 25;

       num2 = (num1 == 10) ? 100 : 200;
        System.out.println("num2: " + num2);

        num2 = (num1 == 25) ? 100:200;
        System.out.println("num2: " + num2);

        int score = 75;

        String resultMessage = (score >= 60) ? "Pass" : "Fail";
        System.out.println("Result: " + resultMessage);
    }
}


