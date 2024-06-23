package First.step.in.java;

import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter triangle side: ");
        int a = scanner.nextInt();

        System.out.println("Enter triangle side: ");
        int b = scanner.nextInt();

        System.out.println("Enter triangle side: ");
        int c = scanner.nextInt();

        int perimeter = a + b + c;
        System.out.println("Perimeter is: " + perimeter);

    }
}
