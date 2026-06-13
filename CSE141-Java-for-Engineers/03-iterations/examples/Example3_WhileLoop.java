// ============================================================
//  EXAMPLE 3 — Print numbers from 1 to 5 using while loop
// ============================================================

// ── STEP 1: Understand the problem ──────────────────────────
//  Same as printing 1 to N, but this time we MUST use
//  a while loop instead of a for loop.

// ── STEP 2: Think in plain English ──────────────────────────
//  - We need a variable to track the current number
//  - Start it at 1
//  - As long as it is 5 or less, keep printing
//  - After each print, increase the variable by 1

// ── STEP 3: Pseudocode ──────────────────────────────────────
//  i = 1
//  WHILE i <= 5:
//      print i
//      i = i + 1

// ── STEP 4: Java Code ───────────────────────────────────────
public class Example3_WhileLoop {
    public static void main(String[] args) {

        int i = 1;              // initialize BEFORE the loop
        while (i <= 5) {        // condition checked at the TOP
            System.out.println(i);
            i++;                // step INSIDE the body — never forget this!
        }

    }
}

// ── Expected Output ─────────────────────────────────────────
//  1
//  2
//  3
//  4
//  5

// ── for vs while ────────────────────────────────────────────
//  for loop:
//      for (int i = 1; i <= 5; i++) { ... }
//
//  while loop (same logic, written differently):
//      int i = 1;
//      while (i <= 5) { ... i++; }
//
//  Both do exactly the same thing.
//  Use for  → when you know the number of iterations upfront.
//  Use while → when the stop condition depends on something else.
