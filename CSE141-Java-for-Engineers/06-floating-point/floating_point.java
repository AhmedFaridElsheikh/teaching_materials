//        // In real math: 0.1 + 0.2 == 0.3. Always. Obviously.
//        System.out.println(0.1 + 0.2);         // 0.30000000000000004
//        System.out.println(0.1 + 0.2 == 0.3);  // false !!
//        float a = 16777216f;  // 2^24
//        float b = a + 1;
//
//        System.out.println(a == b); // true !!
//// There is no float between 16777216 and 16777218

//        double a = 1e15, b = -1e15, c = 1.5;
//
//        System.out.println((a + b) + c); // 1.5   ✓
//        System.out.println(a + (b + c)); // 2.0   ✗  (b + c loses precision first)

//        System.out.println(1.0 / 0.0);   // Infinity  (not an error!)
//        System.out.println(-1.0 / 0.0);  // -Infinity
//        System.out.println(0.0 / 0.0);   // NaN
//
//// NaN is not equal to itself — unique in all of programming
//        double nan = Double.NaN;
//        System.out.println(nan == nan);   // false !!
//        System.out.println(Double.isNaN(nan)); // true  ← correct way to check

       
        System.out.println(1e308 + 1e308 + (-1e308));          // Infinity  ✗
        System.out.println(1e308 + (1e308 + (-1e308)));         // 1.0E308   ✓

        
// ✅ Cleaner demo of a small number being "swallowed"
        double x = 1e17;
        System.out.println(x + 1.0 == x); // true! 1.0 is below the precision threshold of 1e17