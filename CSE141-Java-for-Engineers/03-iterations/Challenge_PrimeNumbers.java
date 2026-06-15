// Find all prime numbers 
import java.util.Scanner;

public class Challenge_PrimeNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;         // assume prime until proven otherwise

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {           // j divides i evenly → not prime
                    isPrime = false;
                    break;                  // no need to keep checking
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

    }
}

