package First.step.in.java;

public class exercise5 {
    public static void main(String[] args) {
        double a = 1;
        double b = 3;
        double c = -4;

        double root1;
        double root2;

        double discriminant = b * b - 4 * a * c;
        System.out.println("Discriminant = " + discriminant);

        root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        System.out.println("/nDiscriminant > 0");
        System.out.println("root1 = " + root1);
        System.out.println("root2 = " + root2);
    }
}
