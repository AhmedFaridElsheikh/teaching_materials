package operators;
public class IfElseDemo {
    public static void main(String[] args) {

        // --- Basic if ---
        int temperature = 35;
        System.out.println("=== Basic if ===");
        if (temperature > 30) {
            System.out.println("It's hot! Drink water.");
        }

        // --- if-else ---
        int age = 16;
        System.out.println("\n=== if-else ===");
        if (age >= 18) {
            System.out.println("You can vote.");
        } else {
            System.out.println("You cannot vote yet.");
        }

        // --- else-if chain (grade calculator) ---
        int score = 75;
        System.out.println("\n=== else-if Chain ===");
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");   // <- this one runs
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        // --- Nested if-else ---
        int concertAge = 20;
        boolean hasTicket = true;
        System.out.println("\n=== Nested if-else ===");
        if (concertAge >= 18) {
            if (hasTicket) {
                System.out.println("Welcome! Enjoy the concert.");
            } else {
                System.out.println("You need a ticket to enter.");
            }
        } else {
            System.out.println("Must be 18+ to attend.");
        }
    }
}
