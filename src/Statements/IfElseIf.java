package Statements;

public class IfElseIf {
    public static void main(String[] args) {
        int num = 1234;
        if (num < 100 && num >= 100) {
            System.out.println("It's a two digital number");
        } else if (num < 1000 && num >= 100) {
            System.out.println("It's three digital number");
        } else if (num < 10000 && num >= 1000) {
            System.out.println("It's four digital number");
        } else {
            System.out.println("number is not between 1 & 99999");
        }
    }
}
