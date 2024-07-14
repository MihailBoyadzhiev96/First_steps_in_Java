package Operators;

public class AssignmentOperators {
    public static void main(String[] args) {
     int num1 = 10;
     int num2;

     num2 = num1;
     System.out.println("num2 = num1 Output: " + num2);

     num2 += num1;
     System.out.println("num2 += num1 Output: " + num2);

     num2 -= num1;
     System.out.println("num2 -= num1 Output: " + num2);

     num2 *= num1;
     System.out.println("num2 *= num1 Output: " + num2);

     num2 /= num1;
     System.out.println("num2 /= num1 Output: " + num2);

     num2 %= num1;
     System.out.println("num2 %= num1 Output: " + num2);

     num2 = 21;
     num2 %= num1;
     System.out.println("num2 %= num1 Output: " + num2);

    }
}
