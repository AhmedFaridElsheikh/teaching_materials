package operators;
public class LogicalDemo {
    public static void main(String[] args) {

        int height = 150, age = 14;
        boolean isStudent = true, isSenior = false;
        boolean isDoorLocked = true;

        System.out.println("=== Logical Operators ===");

        // AND: both must be true
        boolean canRide = (height >= 140) && (age >= 12);
        System.out.println("Can ride roller coaster? " + canRide);  // true

        // OR: at least one must be true
        boolean getsDiscount = isStudent || isSenior;
        System.out.println("Gets discount? " + getsDiscount);       // true

        // NOT: reverses the value
        boolean doorOpen = !isDoorLocked;
        System.out.println("Door is open? " + doorOpen);            // false

        // Combined example
        int score = 85;
        boolean passed = (score >= 50) && (score <= 100);
        System.out.println("Valid passing score? " + passed);       // true
    }
}
