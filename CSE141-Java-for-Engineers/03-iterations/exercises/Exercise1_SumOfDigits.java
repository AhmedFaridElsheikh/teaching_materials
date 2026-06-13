// ============================================================
//  EXERCISE 1  Compute the sum of digits of an integer
// ============================================================
import java.util.Scanner;

public class Exercise1_SumOfDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        while (n > 0) {
            sum += n % 10;  // add last digit to sum
            n   /= 10;      // remove last digit
        }

        System.out.println("Sum of digits = " + sum);
        sc.close();

    }
}

