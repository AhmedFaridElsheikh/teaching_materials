package operators;
public class ComparisonDemo {
    public static void main(String[] args) {

        int x = 10, y = 5;

        System.out.println("=== Comparison Operators ===");
        System.out.println("x == y : " + (x == y));   // false
        System.out.println("x != y : " + (x != y));   // true
        System.out.println("x >  y : " + (x > y));    // true
        System.out.println("x <  y : " + (x < y));    // false
        System.out.println("x >= y : " + (x >= y));   // true
        System.out.println("x <= y : " + (x <= y));   // false

        // Common mistake demo
        int age = 18;
        // age = 20;  <- this is ASSIGNMENT, it changes age to 20
        boolean check = (age == 18);  // this is COMPARISON -> true
        System.out.println("\nIs age 18? " + check);
    }
}
