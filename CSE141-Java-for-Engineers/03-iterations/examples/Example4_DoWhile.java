// ============================================================
//  EXAMPLE 4 — Keep asking until user enters an even number
// ============================================================
import java.util.Scanner;
public class Example4_DoWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Enter an even number: ");
            n = sc.nextInt();
        } while (n % 2 != 0);   // keep looping if NOT even

        System.out.println("You entered: " + n);
        sc.close();

    }
}

