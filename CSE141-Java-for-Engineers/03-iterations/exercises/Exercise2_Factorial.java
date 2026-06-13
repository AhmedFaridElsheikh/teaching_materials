// ============================================================
//  EXERCISE 2 — Calculate N! (Factorial)
// ============================================================

// ── STEP 1: Understand the problem ──────────────────────────
//  Factorial of N = N x (N-1) x (N-2) x ... x 2 x 1
//  Example: 5! = 5 x 4 x 3 x 2 x 1 = 120

// ── STEP 2: Think in plain English ──────────────────────────
//  We need to multiply all numbers from 1 up to N together.
//
//  This is similar to summing 1 to N:
//    Sum:     result = 0,  then result = result + i   each step
//    Factorial: result = 1,  then result = result * i   each step
//
//  Important: start result at 1 (not 0), because multiplying by 0 kills everything.
//
//  Why long and not int?
//    int max value  =  2,147,483,647
//    13! = 6,227,020,800  → already bigger than int max!
//    long handles up to 20! safely.

// ── STEP 3: Pseudocode ──────────────────────────────────────
//  read n
//  result = 1
//  FOR i = 1 to n:
//      result = result * i
//  print n + "! = " + result

// ── STEP 4: Java Code ───────────────────────────────────────
import java.util.Scanner;

public class Exercise2_Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long result = 1;        // use long, not int

        for (int i = 1; i <= n; i++) {
            result *= i;        // same as: result = result * i
        }

        System.out.println(n + "! = " + result);
        sc.close();

    }
    
}

// ── Trace example (n = 5) ───────────────────────────────────
//
//  i = 1:  result = 1  * 1 = 1
//  i = 2:  result = 1  * 2 = 2
//  i = 3:  result = 2  * 3 = 6
//  i = 4:  result = 6  * 4 = 24
//  i = 5:  result = 24 * 5 = 120
//
//  Output: 5! = 120
