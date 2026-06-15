package operators;
public class ArithmeticDemo {
    public static void main(String[] args) {

        int a = 10, b = 3;

        System.out.println("=== Arithmetic Operators ===");
        System.out.println("a + b = " + (a + b));   // 13
        System.out.println("a - b = " + (a - b));   // 7
        System.out.println("a * b = " + (a * b));   // 30
        System.out.println("a / b = " + (a / b));   // 3  <- integer division!
        System.out.println("a % b = " + (a % b));   // 1  <- remainder

        // Fix: use double to get the real result
        double realDiv = (double) a / b;
        System.out.println("Real division = " + realDiv);  // 3.333...

        // Pizza example
        int slices = 8, people = 3;
        System.out.println("\n=== Pizza Share ===");
        System.out.println("Each gets: " + (slices / people));
        System.out.println("Leftover:  " + (slices % people));
    }
}
